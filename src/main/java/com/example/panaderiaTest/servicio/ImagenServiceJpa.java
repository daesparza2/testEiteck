package com.example.panaderiaTest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.panaderiaTest.modelo.Imagen;
import com.example.panaderiaTest.repositorio.ImagenRepository;

@Service
public class ImagenServiceJpa implements IImagenService {

	@Autowired
	private ImagenRepository imgRepo;
	
	@Override
	public void guardar(Imagen imagen) {
		// TODO Auto-generated method stub
		imgRepo.save(imagen);
	}

}
