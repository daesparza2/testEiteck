package com.example.panaderiaTest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.panaderiaTest.modelo.Caja;
import com.example.panaderiaTest.repositorio.CajaRepository;

@Service
public class CajaServiceJpa implements ICajaService {

	
	@Autowired
	private CajaRepository cajaRepo;
	
	@Override
	public void guardar(Caja caja) {
		// TODO Auto-generated method stub
		cajaRepo.save(caja);
	}

	@Override
	public Caja buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return cajaRepo.findById(id).get();
	}

	@Override
	public List<Caja> listarTodos() {
		// TODO Auto-generated method stub
		return cajaRepo.findAll();
	}

}
