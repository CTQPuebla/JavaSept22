package com;

import java.util.Date;

public class ClaseHija extends ClasePrueba{

	Date fechaActual;
	boolean bandera;
	
	public ClaseHija() {
		
	}
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	//anotacion de java
	@Override
	public void imprimiMensaje() {
		System.out.println("Este es otro mensaje"+(13+6));
	}

}
