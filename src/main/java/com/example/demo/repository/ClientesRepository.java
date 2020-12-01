package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Cliente;


public interface ClientesRepository extends JpaRepository<Cliente, Long>{


}

