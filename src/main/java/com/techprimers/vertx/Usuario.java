package com.techprimers.vertx;

public class Usuario {
	
	public String nombre;
	public String contrasena;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String nombre,String contrasena) {
		this.nombre=nombre;
		this.contrasena=contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

}
