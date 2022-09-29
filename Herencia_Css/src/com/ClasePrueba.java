package com;

public  class ClasePrueba {
	
	public String atributoA;
	private int atributo;
	protected double atributoC;
	
	//Atributo de clase
	public static String atributoD = "VALOR";
	public static final String MENSAJE = "NO PUEDO CAMBIAR";
	
	public ClasePrueba() {
		
	}

	public ClasePrueba(String atributoA, int atributo, double atributoC) {
		
		this.atributoA = atributoA;
		this.atributo = atributo;
		this.atributoC = atributoC;
	}

	public String getAtributoA() {
		return atributoA;
	}

	public void setAtributoA(String atributoA) {
		this.atributoA = atributoA;
	}

	public int getAtributo() {
		return atributo;
	}

	public void setAtributo(int atributo) {
		this.atributo = atributo;
	}

	public double getAtributoC() {
		return atributoC;
	}

	public void setAtributoC(double atributoC) {
		this.atributoC = atributoC;
	}

	@Override
	public String toString() {
		return "ClasePrueba [atributoA=" + atributoA + ", atributo=" + atributo + ", atributoC=" + atributoC + "]";
	}
	
	//-------Comportamiento propio
	
	public void ImprimirMensaje() {
		System.out.println("Impresion desde la clase prueba ");
	}
	
	
	// Polimorfismo//////////////////

	public int multiplicar(int a, int b) {
		
		return a * b;
	}
	
	public double multiplicar(double a, int b) {
		double multiplicacion = 0.0;
		for(int i=0; i<b; i++) {
			multiplicacion = multiplicacion + a;
		}
		return multiplicacion;
	}
	
	public double multiplicar(String numero) {
		
		double multiplicacion = 0.0;
		try {
			multiplicacion = Integer.parseInt(numero)* 10;
		}catch(Exception ex) {
			System.out.println("Error");
		}
		
		return multiplicacion;
		
	}

}
