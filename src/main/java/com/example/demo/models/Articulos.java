package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulos {

	@Id
	private Integer codArticulo;
	@Column
	private String nombreArticulo;
	@Column
	private String descripcion;
	@Column
	private Integer valorArticulo;
	@Column
	private Integer cantidadArticulo;
	
	@Column
	private Date fechaarticulo;
	
	public Articulos()
	{
		
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Articulos(Integer codArticulo, String nombreArticulo, String descripcion, 
		Integer valorArticulo, Integer cantidadArticulo,  Date fechaarticulo)
	{
		this.codArticulo=codArticulo;
		this.nombreArticulo=nombreArticulo;
		this.descripcion=descripcion;
		this.valorArticulo=valorArticulo;
		this.cantidadArticulo=cantidadArticulo;
		this.fechaarticulo=fechaarticulo;
	}
	public Integer getCodArticulo() {
		return codArticulo;
	}
	public void setCodArticulo(Integer codArticulo) {
		this.codArticulo = codArticulo;
	}
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	public Integer getValorArticulo() {
		return valorArticulo;
	}
	public void setValorArticulo(Integer valorArticulo) {
		this.valorArticulo = valorArticulo;
	}
	public Integer getCantidadArticulo() {
		return cantidadArticulo;
	}
	public void setCantidadArticulo(Integer cantidadArticulo) {
		this.cantidadArticulo = cantidadArticulo;
	}
	public Date getFechaarticulo() {
		return fechaarticulo;
	}
	public void setFechaarticulo(Date fechaarticulo) {
		this.fechaarticulo = fechaarticulo;
	}
	
	
}
