package com;

import java.util.Date;

public class Profesionista extends Persona {
    
	String titulo;
	String estudios;


    public Profesionista() {
    	
    }
    
    public void getFechaActual() {
		System.out.println(new Date());
		
 }

}