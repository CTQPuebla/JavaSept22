package com;

public class Principal {
	
	public static void main(String[] args) {
		ClasePrueba claseP = new ClasePrueba("Hola", 20, 30.6);
		claseP.ImprimirMensaje();
		
		claseP.getAtributo();
		
		System.out.println(claseP.atributoD); 
		
		//Instancia de la clase hija
		ClaseHija claseH = new ClaseHija();
		
		claseH.ImprimirMensaje();
		claseH.getAtributo();
		claseH.getFechaActual();
		
		System.out.println(claseH.atributoD);
		claseP.atributoD = "Un valor mas raro";
		//claseP.MENSAJE = "45fjgnvjb";
		
		System.out.println(claseH.MENSAJE); 
		
		
		//Modificadores de acceso public.private,protected
		
		ClasePrueba objeto = new ClasePrueba("ABCF", 20,30.6);
		objeto.atributoA = "ciro"; //llamada al atributo de clase
		objeto.setAtributoA("Mario");//llamada mediante setter
		
		System.out.println(objeto.atributoD);
		
		//llamada a un atributo privado(no funciona)
		//objeto.atributo=10; 
		
		objeto.setAtributo(18);
		objeto.atributoC= 3.1416;
		
		System.out.println(claseP.multiplicar(2.7,8));
		
		System.out.println(claseP.multiplicar("60"));
		
		
	}

}
