package com;

import java.util.Date;

public class ClaseHija extends ClasePrueba{ //palabra reservada
	
	Date fechaActual;
	boolean bandera;
	
	public ClaseHija() {
		
	}
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	//Anotacion Java
	public void imprimirMensaje() {
		System.out.println("Este es otro mensaje"+(10+50));
	}
}
