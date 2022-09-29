package com;

import java.util.Date;

//palabra reservada extends(estoy otorgandole cosas)
public class ClaseHija extends ClasePrueba{
	
	Date fechaActual;
	boolean bandera;
	
	
	public ClaseHija() {
		
	}
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	@Override//Sobreescribe el metodo(Anotacion de Java)
	//Mismo metodo que la clase prueba pero con logica de la clase hija
	public void imprimirMensaje() {
		System.out.println("Este es otro metodo nativo de la clase hija"+(10+50));
		
		
	}

}
