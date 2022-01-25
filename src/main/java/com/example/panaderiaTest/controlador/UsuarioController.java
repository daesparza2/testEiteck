package com.example.panaderiaTest.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.panaderiaTest.modelo.Pedido;
import com.example.panaderiaTest.modelo.Usuario;
import com.example.panaderiaTest.servicio.IUsuarioService;

@RestController
@RequestMapping(value="/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private IUsuarioService userServ;
	
	@GetMapping("/listaEnvios/{id}")
	public Usuario porEntregar(@PathVariable Long id){
		
				
		try {
			
			return userServ.buscarPorId(id);
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
		
	}
}
