package com;

public class Claseprueba {
	public String atributoA;
	private int tributoB;
	protected double atributoC;
	
	//ATRIBUTO DE CLASE
	public static String atributoD = "VALOR";
	public static final String MENSAJE = "NO PUEDO CAMBIAR";
	
	
	
	public Claseprueba () {
	
	
}

	
	@Override
	public String toString() {
		return "Claseprueba [atributoA=" + atributoA + ", tributoB=" + tributoB + ", atributoC=" + atributoC + "]";
	}


	public String getAtributoA() {
		return atributoA;
	}


	public void setAtributoA(String atributoA) {
		this.atributoA = atributoA;
	}


	public int getTributoB() {
		return tributoB;
	}


	public void setTributoB(int tributoB) {
		this.tributoB = tributoB;
	}


	public double getAtributoC() {
		return atributoC;
	}


	public void setAtributoC(double atributoC) {
		this.atributoC = atributoC;
	}


	public Claseprueba(String atributoA, int tributoB, double atributoC) {
		super();
		this.atributoA = atributoA;
		this.tributoB = tributoB;
		this.atributoC = atributoC;
	}

//----Comportamiento propio
	public void imprimirMensaje () {
		System.out.println("Impresion desde la clase prueba");
	}
	
	
	public int multiplicar (int a, int b) {
		
		return a*b;
		
	}
	
	public double multiplicar (double a, int b) {
		double multiplicacion = 0.0;
		for (int i = 0; i < b; i++) {
		multiplicacion =  multiplicacion + a;
				
	}	
	return multiplicacion;
	
	}
	
	public double multiplicar (String numero) {
		
		double multiplicacion=0.0;
		try {
			multiplicacion = Integer.parseInt(numero)* 10;
		} catch (Exception ex) {
			System.out.println("Error");
		}
		return multiplicacion;
	}
	
	
	
	
	
	}//claseprueba

	