package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Cliente;
import com.example.demo.models.Pedido;

public interface PedidosRepository extends JpaRepository<Pedido, Long>{

}

