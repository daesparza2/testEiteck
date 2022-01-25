package com.example.panaderiaTest.servicio;

import java.util.List;

import com.example.panaderiaTest.modelo.Pedido;

public interface IPedidoService {

	void guardar(Pedido pedido);
	
	List<Pedido> listarTodos();
	
	Pedido buscarPorId(Long id);
}
