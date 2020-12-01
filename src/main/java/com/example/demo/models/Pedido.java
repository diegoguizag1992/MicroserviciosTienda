package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {
	

	@Id
	private Integer codPedido;
	@Column
	private Integer cedulaCliente;
	@Column
	private String nombreCliente;
	@Column
	private String apellidoCliente;
	@Column
	private String nombreArticulo;
	@Column
	private String descripcion;
	@Column
	private Date fechaArticulo;

	
	public Pedido()
	{
		
	}
	public Pedido(Integer codPedido, Integer cedulaCliente, String nombreCliente, String apellidoCliente,
		String nombreArticulo, String descripcion,  Date fechaArticulo)
	{
		this.codPedido=codPedido;
		this.cedulaCliente=cedulaCliente;
		this.nombreCliente=nombreCliente;
		this.apellidoCliente=apellidoCliente;
		this.nombreArticulo=nombreArticulo;
		this.descripcion=descripcion;
		this.fechaArticulo=fechaArticulo;

	}
	public Integer getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}
	public Integer getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(Integer cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaArticulo() {
		return fechaArticulo;
	}
	public void setFechaArticulo(Date fechaArticulo) {
		this.fechaArticulo = fechaArticulo;
	}
	

}
