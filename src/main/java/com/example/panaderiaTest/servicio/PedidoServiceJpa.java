package com.example.panaderiaTest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.panaderiaTest.modelo.Pedido;
import com.example.panaderiaTest.repositorio.PedidoRepository;

@Service
public class PedidoServiceJpa implements IPedidoService {

	@Autowired
	private PedidoRepository pedidoRepo;
	
	@Override
	public void guardar(Pedido pedido) {
		// TODO Auto-generated method stub
		pedidoRepo.save(pedido);
	}

	@Override
	public List<Pedido> listarTodos() {
		// TODO Auto-generated method stub
		return pedidoRepo.findAll();
	}

	@Override
	public Pedido buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return pedidoRepo.findById(id).get();
	}

}
