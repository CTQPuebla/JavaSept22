package com;

public class ClasePrueba {
	
	
	public String atributoA;
	private int atributoB;
	protected double atributoC;
	
	public static String atributoD = "VALOR";//atributo instancia,los atributos static siempre tienen el mismo valor
	public static final String MENSAJE = "NO PUEDO CAMBIAR"; //las mayusculas son constantes //final vuelve inmutable el atributo
	public ClasePrueba() {
		
	}

	public ClasePrueba(String atributoA, int atributoB, double atributoC) {
	super();// llamado al constructor de la clase padre
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.atributoC = atributoC;
	}

	public String getAtributoA() {
		return atributoA;
	}

	public void setAtributoA(String atributoA) {
		this.atributoA = atributoA;
	}

	public int getAtributoB() {
		return atributoB;
	}

	public void setAtributoB(int atributoB) {
		this.atributoB = atributoB;
	}

	public double getAtributoC() {
		return atributoC;
	}

	public void setAtributoC(double atributoC) {
		this.atributoC = atributoC;
	}

	@Override
	public String toString() {
		return "ClasePrueba [atributoA=" + atributoA + ", atributoB=" + atributoB + ", atributoC=" + atributoC + "]";
	}
	
	//la herencia sirve para especializar un modelo
	 
	
	//-----------Comportamiento propio
	public  void imprimirMensaje() {
		 
		 System.out.println("Impresion desde la clase prueba");
		 
	 }
	
	public int multiplicar(int a,int b) {
		return a*b;
		
	}

	public double multiplicar(double a,int b) {
		double multiplicacion =0.0;
		for (int i = 0; i< b; i++) {
			multiplicacion = multiplicacion + a;	
		}
		return multiplicacion;
	}
	public double multiplicar(String numero) {
	
	double multiplicacion =0.0;
	try {
		multiplicacion = Integer.parseInt(numero)*10;
	}catch(Exception ex) {
    System.out.println("Error");
}
	return multiplicacion;
	}
}
