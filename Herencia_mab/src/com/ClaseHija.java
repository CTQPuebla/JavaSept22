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
	public void ImprimirMensaje() {
		System.out.println("ESTE ES OTRO MENSAJE"+(10+50));
		
	}
	
	
}
