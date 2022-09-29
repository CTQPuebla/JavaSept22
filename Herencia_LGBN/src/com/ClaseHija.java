package com;

import java.util.Date;

public class ClaseHija extends Prueba {
	
	Date fecha;
	boolean bandera;
	
	
	public ClaseHija () {
		
	}
	
	public void getfecha() {
		System.out.println(new Date());
	}
	@Override//   no utiliza lo que se le heredo si no lo que el quiera
	public void ImprimirMensaje() {
		System.out.println("este es otro mensaje"+(10+5));
	}
	
}
