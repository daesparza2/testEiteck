package com.example.panaderiaTest.servicio;

import com.example.panaderiaTest.modelo.Usuario;

public interface IUsuarioService {

	
	Usuario buscarPorId(Long id);
	
	void guardar(Usuario usuario);
}
