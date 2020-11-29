package com.techprimers.vertx;

public class Libro {
	public String nombre;
	public String ISBN;
	public String tema;
	public String editorial;
	public String autor;
	public int anho;
	
	
	
	public Libro() {
		
	}


	public Libro(String nombre, String iSBN, String tema, String editorial, String autor, int anho) {
		super();
		this.nombre = nombre;
		ISBN = iSBN;
		this.tema = tema;
		this.editorial = editorial;
		this.autor = autor;
		this.anho = anho;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	
	
}
