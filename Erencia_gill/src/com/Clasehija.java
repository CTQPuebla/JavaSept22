package com;

import java.util.Date;

public class Clasehija extends Claseprueba{
	
	Date fechaActual;
	
	boolean bandera;
	
	public Clasehija() {
		}
	
	
		
		public void getfechaActual() {
			System.out.println(new Date());
		}
		
	// este metodo es propio
		@Override // ---anotacion de java 
	public void ImprimirMensaje() {
		System.out.println("Este es otro menssje"+(10+50));
		
	}
		
		
		
		
		
	
	

	

}// class
