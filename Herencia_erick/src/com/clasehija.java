package com;

import java.util.Date;

public class clasehija extends claseprueba{

	Date fechaActual;
	boolean bandera;
	
	
	public clasehija() {
	
	}
	
	
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	
	//Anotacion de JAva
	@Override
	public void ImprimirMensaje() {
		System.out.println("impresion desde la clase prueba");
	
	
	
	
	}
}
