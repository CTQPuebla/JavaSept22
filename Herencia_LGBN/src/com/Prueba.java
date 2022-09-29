package com;

public class Prueba {
		
	public String at1; //alcanzable en cualquier parte
	private int at2;// solo lo alcanza donde fue creado
	protected double at3;// alcanzable solo donde es heredado
	
	//STATIC UN VALOR PARA TODO
	public static String at4 = "VALOR";
	
	//FINAL VULVE INMUTABLE EL ATRIBUTO
	public static final String MENSAJE = "NO PUEDO CAMBIAR";
	
	
	
	
	public Prueba() {
		
	}

	public Prueba(String at1, int at2, double at3) {
		this.at1 = at1;
		this.at2 = at2;
		this.at3 = at3;
	}

	public String getAt1() {
		return at1;
	}

	public void setAt1(String at1) {
		this.at1 = at1;
	}

	public int getAt2() {
		return at2;
	}

	public void setAt2(int at2) {
		this.at2 = at2;
	}

	public double getAt3() {
		return at3;
	}

	public void setAt3(double at3) {
		this.at3 = at3;
	}
	
//	ANOTACION DE JAVA
	@Override
	public String toString() {
		return "Prueba [at1=" + at1 + ", at2=" + at2 + ", at3=" + at3 + "]";
	}
	
	//-----COMPORTAMINETO PROPIO
	public void ImprimirMensaje() {
		System.out.println("Imprimir desde la clase prueba");
	}
	public int multiplicar(int a, int b) {
		return a*b;
	}
	public double multiplicar(double a, int b) {
		double multiplicacion= 0.0;
		for (int i = 0; i < b; i++) {
			multiplicacion = multiplicacion +a;
			
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
