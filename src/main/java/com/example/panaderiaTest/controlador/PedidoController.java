package com.example.panaderiaTest.controlador;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.panaderiaTest.modelo.Caja;
import com.example.panaderiaTest.modelo.Pedido;
import com.example.panaderiaTest.modelo.Usuario;
import com.example.panaderiaTest.servicio.ICajaService;
import com.example.panaderiaTest.servicio.IPedidoService;
import com.example.panaderiaTest.servicio.IUsuarioService;

@RestController
@RequestMapping(value="/pedido")
@CrossOrigin(origins = "*")
public class PedidoController {
	
	@Autowired
	private IPedidoService pedidoServ;
	
	@Autowired
	private IUsuarioService userServ;
	
	@Autowired
	private ICajaService cajaServ;
	
	@GetMapping("/listar")
	public List<Pedido> porEntregar(){
		
		return pedidoServ.listarTodos();
	}
	
	@PostMapping("/registrar")
	public String guardar(@RequestBody Pedido pedido) {
		
		Usuario user = userServ.buscarPorId(pedido.getUsuarioId());
		pedido.setTotal(0.0);
		pedidoServ.guardar(pedido);
		
		user.agregar(pedido);
		userServ.guardar(user);
		
		return "Se registro su pedido";
	}
	
	@PostMapping("/addCajaPedido")
	public String agregarCajaPedido(@RequestParam("idcaja") Long idcaja,
			@RequestParam("idpedido") Long idpedido) {
		
		try {
			
			Pedido pedido = pedidoServ.buscarPorId(idpedido);
			Caja caja = cajaServ.buscarPorId(idcaja);
			pedido.agregar(caja);
			pedido.setTotal(pedido.getTotal() + caja.getPrecio());
			pedidoServ.guardar(pedido);
			
			return "Se agrego la caja a su pedido";
			
		} catch (Exception e) {
			// TODO: handle exception
			return "Error es posible que la caja o el pedido tengan algun defecto o no existan";
		}
		
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

}
