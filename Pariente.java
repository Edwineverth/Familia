package com.interlandcompu.familia;

public class Pariente extends Persona{
	
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoFamiliar getTipoFamiliar() {
		return tipoFamiliar;
	}

	public void setTipoFamiliar(TipoFamiliar tipoFamiliar) {
		this.tipoFamiliar = tipoFamiliar;
	}
	

	/**
	 * 
	 */
	public Pariente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param cedulaIdentidad
	 * @param estadoCivil
	 * @param edad
	 */
	public Pariente(String nombre, String apellido, String cedulaIdentidad, EstadosCiviles estadoCivil, int edad, Sexo sexo, TipoFamiliar tipoFamiliar) {
		super(nombre, apellido, cedulaIdentidad, estadoCivil, edad);
		this.sexo = sexo;
		this.tipoFamiliar = tipoFamiliar;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Pariente [sexo=" + sexo + ", tipoFamiliar=" + tipoFamiliar + ", getSexo()=" + getSexo()
				+ ", getTipoFamiliar()=" + getTipoFamiliar() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getCedulaIdentidad()=" + getCedulaIdentidad() + ", getEstadoCivil()="
				+ getEstadoCivil() + ", getEdad()=" + getEdad() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	private Sexo sexo;
	private TipoFamiliar tipoFamiliar; 
	
	enum Sexo {
		 Masculino,
		 Femenino
		}

	enum TipoFamiliar {
		  Padre,
		  Madre,
		  Hijo
		}
	

}
