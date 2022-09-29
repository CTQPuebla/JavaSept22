package com;

public class Principal {

	public static void main(String[] Args) {
		
		clasePrueba claseP = new clasePrueba("Hola", 20, 30.6);
        claseP.ImprimirMensaje();
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD = "un valor mas raro";
		
		
		//Instancia de clase hija
		ClaseHija ClaseH = new ClaseHija();
		ClaseH.ImprimirMensaje();
		ClaseH.getAtributoB();
		ClaseH.getFechaActual();
		
		System.out.println(ClaseH.atributoD);
		
		//Modificadores de acceso public, private, protected
		//delimitar el acceso a los atributos de las clases
		
		clasePrueba objeto = new clasePrueba("ABCDF", 20, 30.6);
		
		objeto.atributoA = "abcd"; //llamada al atributo de clase
		objeto.setAtributoA("otro valor"); //llamada mediante setter
		System.out.println(objeto.atributoD);
		//objeto.atributoB=10;
		
		objeto.setAtributoB(18);
		objeto.atributoC = 345.23;
		
		System.out.println(claseP.multiplicar(2.7, 8));
		System.out.println(claseP.multiplicar("60"));
		
		
		
	}
}
