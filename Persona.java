package com.interlandcompu.familia;

public class Persona {
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedulaIdentidad() {
		return cedulaIdentidad;
	}

	public void setCedulaIdentidad(String cedulaIdentidad) {
		this.cedulaIdentidad = cedulaIdentidad;
	}

	public EstadosCiviles getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadosCiviles estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Persona () {}
	
	public Persona(String nombre, String apellido, String cedulaIdentidad, EstadosCiviles estadoCivil, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedulaIdentidad = cedulaIdentidad;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
	}


	private String nombre;
	private String apellido; 
	private String cedulaIdentidad;
	private EstadosCiviles estadoCivil; 
	private int edad; 
	
	enum EstadosCiviles {
		  Soltero,
		  Casado,
		  Viudo,
		  Divorciado
		}

	

}

