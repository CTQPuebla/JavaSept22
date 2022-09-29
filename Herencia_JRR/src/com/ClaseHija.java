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

	// Anotción de Java
	@Override
	public void imprimirMensaje() {
		System.out.println("Este es otro mensaje " + (10 + 50));
	}

}
