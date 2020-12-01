package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Articulos;
import com.example.demo.models.Cliente;

public interface ArticulosRepository extends JpaRepository<Articulos, Long>{

}
