package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clase_prueba cp1= new Clase_prueba("Hola", 20, 5.6);
		cp1.getAtributoB();
		
		
		cp1.imprimirMensaje();
		
		System.out.println(cp1.atributoD);
		//INSTANCIA DE CLASE HIJA
		 Clase_hija ch1= new Clase_hija();
		 ch1.imprimirMensaje();
		 ch1.getAtributoB();
		 ch1.getFechaActual();
		 System.out.println(ch1.atributoD); 
		 cp1.atributoD="un valor más";
		 
	
		 //MODIFICADORES DE ACCESO (PUBLIC, PRIVATE AND PROTECTED)
		 
		 Clase_prueba Objeto = new Clase_prueba("ABCD", 20, 10.5);
		 Objeto.atributoA= "ahahgshs";// LLAMADA AL ATRIBUTO DE CLASE
		 
		 //Manera correcta
		 Objeto.setAtributoA("ahhaags"); //LLAMADA MEDIANTE EL SETTER
		 
		 Objeto.setAtributoB(30);
		 
		 System.out.println(Objeto.atributoD);
		 
		 System.out.println(cp1.multiplicar(2.5, 6));
		 System.out.println(cp1.multiplicar("54"));
		 
		 System.out.println(cp1.multiplicar("60"));
	}

}
