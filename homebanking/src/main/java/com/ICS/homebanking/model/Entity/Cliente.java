package com.ICS.homebanking.model.Entity;

public class Cliente {

	int ID;
	String DNI;
	String Nombre;
	String Username;
	String Clave;
	String CorreoElectronico;
	String Estado;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int iD, String dNI, String nombre, String username, String clave, String correoElectronico,
			String estado) {
		super();
		ID = iD;
		DNI = dNI;
		Nombre = nombre;
		Username = username;
		Clave = clave;
		CorreoElectronico = correoElectronico;
		Estado = estado;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getCorreoElectronico() {
		return CorreoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
	
		
}
