package com;

public class Clase_prueba {
	
	public String atributoA;
	private int atributoB;
	protected double  atributoC;
	
	//ATRIBUTO DE CLASE
	public static String atributoD= "valor";
	
	//LETRAS MINISCULAS VARIABLES
	//LETRAS MAYUSCULAS CONSTANTES
	//CONSTANTE
	public static final String MENSAJE= "NO PUEDO CAMBIAR";
	
	
	 public Clase_prueba(){
		
	}



	public Clase_prueba(String atributoA, int atributoB, double atributoC) {
		
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
		return "Clase_prueba [atributoA=" + atributoA + ", atributoB=" + atributoB + ", atributoC=" + atributoC + "]";
	}
	
	public void imprimirMensaje () {
		System.out.println("Impresión de la clase");
	}
	
	public int multiplicar (int a, int b) {
		return a*b;
	}
	
	public double multiplicar(double a, int b) {
		double multiplicacion=0.0;
		for (int i = 0; i < b; i++) {
			multiplicacion+=a;
			
		}
		return multiplicacion;
	}
	
	public double multiplicar (String numero) {
		double multiplicacion=0.0;
		
		try {
			multiplicacion= Integer.parseInt(numero)+10;
		}catch (Exception ex) {
			System.out.println("Error");
		}
		
		return multiplicacion;
	}
	
}
