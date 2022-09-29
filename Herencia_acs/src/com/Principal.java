package com;

public class Principal {
	
	public static void main(String[] args) {
		
		ClasePrueba claseP = new ClasePrueba("Hola", 20, 30.6);
		claseP.ImprimirMensaje(); //mandar a imprimir de la calse prueba
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD = "un valor mas raro";
		
		//Instancia de clase hija
		ClaseHija claseH = new ClaseHija();
		claseH.ImprimirMensaje(); //mandar a imprimir de la clase hija
		claseH.getAtributoB();
		claseH.getFechaActual();
		
		System.out.println(claseH.atributoD);
	
		//modificadores de acceso public, private,protected
		ClasePrueba objeto = new ClasePrueba("ABCDF", 20, 30.6);//encapsulamiento
		objeto.atributoA = "djfbjf"; //llamada de atributo de clase							//delimitar el acceso a los atributos de las clases
		objeto.setAtributoA("Otro  valor"); //llamada mediante setter
		System.out.println(objeto.atributoD);
		
		//Llamada a un atributo privado (no funciona)
		//objeto.atributoB(); 
		
		objeto.setAtributoB(18);
		
	//tercer modificador protected
		objeto.atributoC = 345.23;
		
		System.out.println(claseP.multiplicar(2.3,5));
		System.out.println(claseP.multiplicar("60"));
		
		Persona ClaseP = new Persona("Moreno", "Alvaro", "M", "mexico", 23);
		System.out.println(ClaseP);
//		
//		Profesionista P1 = new Profesionista("Guero", "Jose", "M", "Puebla" 25, "titulado", "ingenieria");
//		System.out.println(P1);
//		ClaseP.getNombre();
	}
	
	

}
