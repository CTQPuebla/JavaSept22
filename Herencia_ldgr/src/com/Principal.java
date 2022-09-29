package com;

public class Principal {
	
	public static void main(String[] args) {
		ClasePrueba claseP = new ClasePrueba ("Hola", 20, 30.6);
		claseP.ImprimirMensaje();
		
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD = "un valor mas raro";
		
				
		
		//Instancia de clase hija
		ClaseHija claseH = new ClaseHija();
		claseH.ImprimirMensaje();
		claseH.getAtributoB();
		claseH.getFechaActual();
		
		System.out.println(claseP.atributoD);
		//modificacion de acceso; public, private, protected
		
		ClasePrueba objeto = new ClasePrueba("ABCDF", 20, 30.6);
	    objeto.atributoA = "atributo"; //Llamado al atributo de clase
	    objeto.setAtributoA("otro valor");//Llamada mediante setter
	    
	    System.out.println(claseP.atributoD);
	    
	    //objeto.atributoB=10; llmada a un atributo privado (no funcion)//
		//estos atributos se llaman con los stters
	    
	    objeto.setAtributoB(18);
	    
	    //SEtter si tiene acceso atributo directo, ya que esta definido por la clase prueba.
	    
	    
	    //protected es un modificador que esta a medio camino en public y privet
	    //se puede ocupar para compartir codigo de la clase de un paquete con clase del mismo paquete
	    
	    objeto.atributoC = 345.23;
	    
	    //si quiero llevarme codigo de una clase, y quiero modificarlo en otra, ahi actua el protected
	    
	    System.out.println(claseP.multiplicar(2.7, 8));
	    System.out.println(claseP.multiplicar("60"));
	}

}
