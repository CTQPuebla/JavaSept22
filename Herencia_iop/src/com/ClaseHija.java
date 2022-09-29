package com;

import java.util.Date;

public class ClaseHija extends ClasePrueba{

	Date fechaactual;
	boolean bandera;
	
	public ClaseHija() {
		
		
	}
	
	public void getFechaActual() {
		System.out.println(new Date());
		
	}
	@Override
	public void ImprimirMensaje() {
		System.out.println("Este es otro mensaje");
	}
}
