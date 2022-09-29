package com;

public class ClasePrincipal {
public static void main(String[] args) {
	
	ClasePrueba claseP = new ClasePrueba("Hola", 20, 30.6);
	claseP.ImprimirMensaje();
	
	
	claseP.getAtributoB();
	System.out.println(claseP.atributoD);
	claseP.atributoD = "Un valor mas raro";
	claseP.MENSAJE	="zsDZSF";
			
	
	ClaseHija claseH = new ClaseHija();
	claseH.getFechaActual();
	claseH.ImprimirMensaje();
	claseH.getAtributoB();
	 
	System.out.println(claseH.atributoD);
	//Modificador de acceso public, private, protected
	
	ClasePrueba objeto = new ClasePrueba ("ABCDF", 20, 30.6);
	objeto.atributoA = "asdasd"; //llamada al atributo de clase
	objeto.setAtributoA("Otro valor"); //llamada mediante setter
	System.out.println(objeto.atributoD);
	objeto.setAtributoB(18);
	objeto.atribuctoC = 345.23;
	
	System.out.println(claseP.multiplicar(2.7,8));
	System.out.println(claseP.multiplicar("60"));
	
	
	
}
}
