package com.example.panaderiaTest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.panaderiaTest.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
