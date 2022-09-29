package com;

import java.util.Date;

public class ClaseHija extends clasePrueba{

	
	Date fechaActual;
	boolean bandera;
		
	public ClaseHija() {
		
	}
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	
	//anotacion de java
	@Override
	public void ImprimirMensaje() {
		System.out.println("este es otro mensaje" + (10+50));
	}
	
}
