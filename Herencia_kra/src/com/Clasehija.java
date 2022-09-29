package com;

import java.util.Date;

public class Clasehija extends Claseprueba {

	Date fechaActual;
	boolean bandera;
	
	
	public Clasehija() {
		
	}
	
	public void getfechaActual() {
		System.out.println(new Date());
	}
//Anotacion de Java
	@Override
	public void imprimirMensaje () {
		System.out.println("Este es otro mensaje"+(10+50));
	}
	
	
	}//publicclass
	
