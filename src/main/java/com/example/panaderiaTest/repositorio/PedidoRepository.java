package com.example.panaderiaTest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.panaderiaTest.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
