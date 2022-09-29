package com;

public class Principal {

	public static void main(String[]args) {
		
		ClasePrueba claseP = new ClasePrueba("hola", 20, 30);
		claseP.ImprimirMensaje();
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD = "UN VALOR ES RARO";
		//claseP.Mensaje = "iuet";
		
		
		//instancia de clase hija
		ClaseHija claseh = new ClaseHija();
		claseh.ImprimirMensaje();
		claseh.getAtributoB();
		claseh.getFechaActual();
		
		System.out.println(claseh.atributoD);
		
		//modificador de acceso son 3 => public, private, protected
		ClasePrueba objeto = new ClasePrueba("abcdf", 20, 30.6);
		objeto.atributoA = "irdhreifh"; //llamada al atributo de clase de manera directa
		objeto.setAtributoA("otro valor"); //llamado mediante setter que es la manera correcta
		
		System.out.println(objeto.atributoD);
		
		//objeto.atributoB=10;  llamada a un atributo privado (no funciona)
		
		objeto.setAtributoB(18);
		objeto.atributoC = 345.23;
		
		System.out.println(claseP.multiplicar(2.7, 3));
		System.out.println(claseP.multiplicar("60"));
		
	}
}
