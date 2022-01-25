package com.example.panaderiaTest.servicio;

import java.util.List;

import com.example.panaderiaTest.modelo.Caja;

public interface ICajaService {
	
	void  guardar(Caja caja);
	
	Caja buscarPorId(Long id);
	
	List<Caja> listarTodos();

}
