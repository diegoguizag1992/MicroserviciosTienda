package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	private Integer codEmpleado;
	@Column
	private Integer cedEmpleado;
	@Column
	private String nombreEmpleado;
	@Column
	private String apellidoEmpleado;
	@Column
	private Integer telEmpleado;
	@Column
	private String dirEmpleado;
	
	public Cliente()
	{
		
	}
	public Cliente(Integer codEmpleado, Integer cedEmpleado, String nombreEmpleado, 
			String apellidoEmpleado, Integer telEmpleado, String dirEmpleado)
	{
		this.codEmpleado=codEmpleado;
		this.cedEmpleado=cedEmpleado;
		this.nombreEmpleado=nombreEmpleado;
		this.apellidoEmpleado=apellidoEmpleado;
		this.telEmpleado=telEmpleado;
		this.dirEmpleado=dirEmpleado;

	}
	public Integer getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public Integer getCedEmpleado() {
		return cedEmpleado;
	}
	public void setCedEmpleado(Integer cedEmpleado) {
		this.cedEmpleado = cedEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}
	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}
	public Integer getTelEmpleado() {
		return telEmpleado;
	}
	public void setTelEmpleado(Integer telEmpleado) {
		this.telEmpleado = telEmpleado;
	}
	public String getDirEmpleado() {
		return dirEmpleado;
	}
	public void setDirEmpleado(String dirEmpleado) {
		this.dirEmpleado = dirEmpleado;
	}

}
