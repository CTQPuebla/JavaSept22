package com;

import java.util.Date;

public class ClaseHija extends ClasePrueba{ // no es multiherencia (heredar de la clase hija a la clase hija)
	
	
	Date fechaActual;
	boolean bandera;
	
	
	public ClaseHija() {
		
	}
	
	
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	
	
 //multiherencia como tal no existe en java
	@Override //reemplazar o se implementara de la misma propia
	public void imprimirMensaje() {
		System.out.println("Este es otro mensaje"+(10+50));
	} 
	//La sobre escritura es un mecanismo por el cual se reemplaza la logica de un metodo por alguna distinta conservando el nombre del metodo.
	//En sobre escritura es reemplazar una cosa por otra(cambiar logica)

}
