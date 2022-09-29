package com;

public class Principal2 {
	public static void main(String[] args){
	
		Persona p1 = new Persona("negro", "eduardo", "masculino", "mexicano", 29);
		p1.ImprimeMsg();
		
		p1.getColorPiel();
		System.out.println(p1.atributoD);
		p1.atributoD="el mundo es un barrio";
		
	
		Profesionista prof = new Profesionista();
		prof.ImprimeMsg();
		prof.getEdad();
		prof.getTitulo();
		
		System.out.println(p1.atributoD);
		
		Profesionista obj = new Profesionista("ingeñero", "diploma");
	    obj.nombre = "galimatias";
	    obj.setNombre("carranca");
	    System.out.println(p1.atributoD);
	    
	}

}
