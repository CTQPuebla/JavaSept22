package com;

import java.util.Date;

public class Clase_hija extends Clase_prueba{
	
	Date dame_fecha;
	boolean bandera;
	
	
	public Clase_hija() {
		
	}
	
	public void getFechaActual () {
		System.out.println(new Date());
	}
	
	@Override
	public void imprimirMensaje() {
		System.out.println("Este es otro mensaje "+ (10+50));
	}
	

}
