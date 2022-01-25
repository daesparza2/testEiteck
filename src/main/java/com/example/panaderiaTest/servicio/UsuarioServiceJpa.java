package com.example.panaderiaTest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.panaderiaTest.modelo.Usuario;
import com.example.panaderiaTest.repositorio.UsuarioRepository;

@Service
public class UsuarioServiceJpa implements IUsuarioService {

	@Autowired
	private UsuarioRepository userRepo;
	
	@Override
	public Usuario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).get();
	}

	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		userRepo.save(usuario);
	}

}
