package com;

import java.util.Date;

public class ClaseHija extends ClasePrueba{
	
	Date FechaActual;
	boolean bandera;
	
	public ClaseHija() {
		
	}
	public void getFechaActual() {
		System.out.println(new Date());
	}
	
	@Override//reemplazar
	public void imprimirMensaje() {
		System.out.println("Este es otro mensaje"+(10+50));
	}
	
	//la sobreeescritura es un mecanismo por el cual se reemplaza la logica de un 
}
