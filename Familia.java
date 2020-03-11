package com.interlandcompu.familia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;


import com.interlandcompu.familia.Pariente.Sexo;
import com.interlandcompu.familia.Pariente.TipoFamiliar;
import com.interlandcompu.familia.Persona.EstadosCiviles;

public class Familia {
	public static List<Pariente> integrantes = new ArrayList<Pariente>();

	public static void main(String[] args) throws Exception {
		
		Familia f = new Familia();
		f.addPadre(new Persona("EBER","BELDUMA","0705709851",EstadosCiviles.Casado,49));
		f.addMadre(new Persona("DILMA","MOROCHO","0705709801",EstadosCiviles.Casado,47));
		f.addHijo(new Persona("EDWIN","BELDUMA","0705709801",EstadosCiviles.Soltero,19));
		f.addHijo(new Persona("DENNYS","BELDUMA","0705709801",EstadosCiviles.Casado,15));
		f.addHija(new Persona("MARITZA","BELDUMA","0705709801",EstadosCiviles.Viudo,20));
		f.addHija(new Persona("LISSET","BELDUMA","0705709801",EstadosCiviles.Divorciado,35));
		 System.out.println(integrantes.toString()); 
		
		 System.out.println(EstadosCiviles.Casado.toString());
		
		f.CualEsHeramanaMenor();
		f.CualEsHeramanoMenor();
		f.CualEsHermanaMayor();
		f.CualEsHermanoMayor();
		f.CuantosHijosHay();
		f.CuantosSonHombres();
		f.CuantosSonMujeres();
		
		f.addPadre(new Persona("ROBERTO","BELDUMA","0705709851",EstadosCiviles.Casado,49));
		f.addMadre(new Persona("MIRIAM","MOROCHO","0705709851",EstadosCiviles.Casado,49));

	}

	public void addPadre(Persona persona) throws Exception {
		long count = integrantes.stream().filter(i -> i.getTipoFamiliar().toString() == TipoFamiliar.Padre.toString())
				.count();
		if (!(count > 0)) {
			Pariente pariente = new Pariente(persona.getNombre(), persona.getApellido(), persona.getCedulaIdentidad(),
					persona.getEstadoCivil(), persona.getEdad(), Sexo.Masculino, TipoFamiliar.Padre);
			integrantes.add(pariente);
		} else
			throw new Exception("Ya existe una persona registrada como padre");

	}

	public void addMadre(Persona persona) throws Exception {
		long count = integrantes.stream().filter(i -> i.getTipoFamiliar().toString() == TipoFamiliar.Madre.toString())
				.count();
		if (!(count > 0)) {
			Pariente pariente = new Pariente(persona.getNombre(), persona.getApellido(), persona.getCedulaIdentidad(),
					persona.getEstadoCivil(), persona.getEdad(), Sexo.Femenino, TipoFamiliar.Madre);
			integrantes.add(pariente);
		}else
			throw new Exception("Ya existe una persona registrada como Madre");

	}

	public void addHijo(Persona persona) {
		Pariente pariente = new Pariente(persona.getNombre(), persona.getApellido(), persona.getCedulaIdentidad(),
				persona.getEstadoCivil(), persona.getEdad(), Sexo.Masculino, TipoFamiliar.Hijo);
		integrantes.add(pariente);
	}

	public void addHija(Persona persona) {
		Pariente pariente = new Pariente(persona.getNombre(), persona.getApellido(), persona.getCedulaIdentidad(),
				persona.getEstadoCivil(), persona.getEdad(), Sexo.Femenino, TipoFamiliar.Hijo);
		integrantes.add(pariente);
	}

	public void ClearFamilia() {
		integrantes.clear();
	}

	public void CuantosHijosHay() {

		long count = integrantes.stream().filter(i -> i.getTipoFamiliar().toString() == TipoFamiliar.Hijo.toString())
				.count();
		System.err.println(count);
	}

	public void CualEsHermanoMayor() {

		Pariente p = integrantes.stream()
				.filter(i -> i.getTipoFamiliar().toString() == TipoFamiliar.Hijo.toString()
						&& i.getSexo().toString() == Sexo.Masculino.toString())
				.max(Comparator.comparing(Pariente::getEdad)).orElseThrow(NoSuchElementException::new);
		System.err.println(p.getNombre());

	}

	public void CualEsHeramanoMenor() {
		Pariente p = integrantes.stream()
				.filter(i -> i.getTipoFamiliar().toString() == TipoFamiliar.Hijo.toString()
						&& i.getSexo().toString() == Sexo.Masculino.toString())
				.min(Comparator.comparing(Pariente::getEdad)).orElseThrow(NoSuchElementException::new);
		System.err.println(p.getNombre());
	}

	public void CualEsHermanaMayor() {
		Pariente p = integrantes.stream()
				.filter(i -> i.getTipoFamiliar().toString() == TipoFamiliar.Hijo.toString()
						&& i.getSexo().toString() == Sexo.Femenino.toString())
				.max(Comparator.comparing(Pariente::getEdad)).orElseThrow(NoSuchElementException::new);
		System.err.println(p.getNombre());
	}

	public void CualEsHeramanaMenor() {
		Pariente p = integrantes.stream()
				.filter(i -> i.getTipoFamiliar().toString() == TipoFamiliar.Hijo.toString()
						&& i.getSexo().toString() == Sexo.Femenino.toString())
				.min(Comparator.comparing(Pariente::getEdad)).orElseThrow(NoSuchElementException::new);
		System.out.println(p.getNombre());
		//System..println();
	}

	public void CuantosSonHombres() {
		long count = integrantes.stream().filter(i -> i.getSexo().toString() == Sexo.Masculino.toString()).count();
		System.err.println(count);
	}

	public void CuantosSonMujeres() {
		long count = integrantes.stream().filter(i -> i.getSexo().toString() == Sexo.Femenino.toString()).count();
		System.err.println(count);
	}

	public void getPariente(int index) {

		System.err.println(integrantes.get(index).toString());
	}

	public void DormirPariente(Pariente pariente) {

	}

	public void DespertarPariente(Pariente pariente) {

	}

}
