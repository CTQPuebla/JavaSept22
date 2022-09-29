package com;

public class Principal {

	public static void main(String[] args) {
		ClasePrueba claseP = new ClasePrueba("Hola", 2, 30.6);
		claseP.imprimirMensaje();
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		System.out.println(ClasePrueba.atributoD);
		claseP.atributoD = "un valor mas raro";
		// ClasePrueba.MENSAJE = "DuRi";

		// System.out.println(claseP);

		// Instancia de clase hija
		ClaseHija claseH = new ClaseHija();
		claseH.imprimirMensaje();
		claseH.getAtributoB();
		// System.out.println(claseH);
		claseH.getFechaActual();

		System.out.println(claseH.atributoD);

		// Modificadores de acceso public, private, protected
		ClasePrueba objeto = new ClasePrueba("ABCDF", 2, 30.6);
		objeto.atributoA = "uhviufe"; // llamado al atributo de clase
		objeto.setAtributoA("otro valor");// llamado mediante setter
		System.out.println(objeto.atributoD);
		objeto.atributoC = 0.47; //

		// llamado a un atributo privado (no funciona)
		// objeto.atributB=10;

		objeto.setAtributoB(10);

		System.out.println(claseP.multiplicar(2.8, 8));
		System.out.println(claseP.multiplicar("60"));
	}

}
