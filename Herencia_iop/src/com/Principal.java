package com;

public class Principal {

	public static void main(String[] args) {
		
		ClasePrueba clasep = new ClasePrueba("Hola", 20, 30.6);
		clasep.ImprimirMensaje();
		
		
		
		clasep.getAtributoB();
		System.out.println(clasep.atributod);
		clasep.atributod = "Un valor mas raro";
		System.out.println(clasep.MENSAJE);

		
		
		//Instancia Clase Hija
		ClaseHija claseh = new ClaseHija();
		claseh.ImprimirMensaje();
		claseh.getAtributoB();
		claseh.getFechaActual();
		
		System.out.println(claseh.atributod);
		//Modificadores de acceso public,private,protected
		
		ClasePrueba objeto = new ClasePrueba("ABCDF", 20, 30.6);
		objeto.atributoA = "kjsdbhfkjsh";//llamada al atributo de clase
		objeto.setAtributoA("Otro Valor");//llamada mediante setter
		System.out.println(objeto.atributod);
		//llamada a un atributo privado (no funciona)
		//objeto.atributoB = 10;
		
		//Manera correcta de llamar al atributo
		objeto.setAtributoB(18);
		
		objeto.atributoC = 345.23;
		
		System.out.println(clasep.multiplicar(2.7, 8));
		System.out.println(clasep.multiplicar("60"));
		
	}
	
}
