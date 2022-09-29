package com;

public class Principal {
	public static void main(String[] args) {
		//clase padre
		ClasePrueba claseP = new ClasePrueba("Hola,",20,30.6);
		claseP.imprimirMensaje();//mande a llamar un metodo de su misma clase
		
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD="Un valor mas raro";
		//claseP.MENSAJE = "safas"; //No puedo modificar el static solo el error
		
		//Creando instancia de la clase hija
		ClaseHija claseH = new ClaseHija();
		//SOBREESCRITURA OVERRIDE (mando a llamar el mismo metodo pero de diferente clase)
		claseH.imprimirMensaje();//llama a un metodo de la clase hija
		//Lamar al objeto de la clase hija
		claseH.getAtributoB();
		claseH.getFechaActual();
		
		System.out.println(claseH.atributoD);
		
		//--------------------------------
		
		/*Persona pers1 = new Persona("Moreno","Ricardo","Hombre",25);
		System.out.println(pers1);
		//Profesionista prof1 = new Profesionista("Ingeniero","Titulado");
		//System.out.println(prof1);
		
		Profesionista prof2 = new Profesionista("", "","", 0, "Ingenieria","Sistemas");
		System.out.println(prof2);
		prof2.Trabajar();
		
		Persona p3 = new Persona("Morenita Clara","Karely","Mujer",20);
		System.out.println(p3);
		
		Profesionista prof3= new Profesionista("", "","", 0, "Mamitas","Puebla");
		System.out.println(prof3);*/
		//--------------------------------------
		
		//Modificadores de Acceso
		//ENCAPSULAMIENTO(delimitar el acceso a los atributos de las clases)
		ClasePrueba objeto = new ClasePrueba("ABCD",20,30.6);
		objeto.atributoA = "ahdkajs";//llamada al atributo de clase
		objeto.setAtributoA("otro valor");//llamada mediante setter(manera correcta)
		System.out.println(objeto.atributoD);
		
		
		//objeto.AtributoB=10; llamada a un atributo privado(NO FUNCIONA)
		objeto.setAtributoB(18);//llamada a un atributo privado mediante setter
		
		//Modificador protected
		objeto.atributoC=13.5;
		//llevarme codigo de un paquete a otro
		
		//<-----------Polimorfismo---------->
		//Llamando a imprimir metodo de clase prueba
		//Este es el 1er metodo
		System.out.println(claseP.multiplicar(7,8));
		//Este es el segundo metodo
		System.out.println(claseP.multiplicar("60"));
		
	}

}
