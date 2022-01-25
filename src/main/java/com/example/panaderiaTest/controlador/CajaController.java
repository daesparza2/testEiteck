package com.example.panaderiaTest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.panaderiaTest.modelo.Caja;
import com.example.panaderiaTest.servicio.ICajaService;

@RestController
@RequestMapping(value="/caja")
@CrossOrigin(origins = "*")
public class CajaController {

	@Autowired
	private ICajaService cajaServ;
	
	@PostMapping("/registrar")
	public String guardar(@RequestBody Caja caja) {
		cajaServ.guardar(caja);
		return "El registro se guardo con exito";
	}
	
	@GetMapping("/listar")
	public List<Caja> listar(){
		return cajaServ.listarTodos();
	}
	
}
