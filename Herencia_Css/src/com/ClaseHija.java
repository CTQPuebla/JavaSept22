package com;

import java.util.Date;

public class ClaseHija extends ClasePrueba {
	
	Date fechaActual;
	boolean bandera;
	
	public ClaseHija() {
		
	}
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	
	//Anotacion de java
	@Override
	public void ImprimirMensaje() {
		System.out.println("Este es otro mensaje " + (10 +50) );
	}

}
