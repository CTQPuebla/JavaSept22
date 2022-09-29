package com;

public class ClasePrueba {

	public String atributoA;
	private int atributoB;
	protected double atributoC;
	
	public static String atributod = "Valor";//Te asigna ese valor como atributo de clase
	public static final String MENSAJE = "No puedo cambiar";//Este valor es inmutable(no puede cambiar)
	
	//Empty constructor
	public ClasePrueba() {
		
	}

	public ClasePrueba(String atributoA, int atributoB, double atributoC) {
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
	
	public void ImprimirMensaje() {
		System.out.println("Impresion desde la clase prueba");
	}


		public int multiplicar(int a, int b) {
			
			return 0;
		}
		
	public double multiplicar(double a, int b) {
		
		double multiplicacion = 0.0;
		for (int i = 0; i < b; i++) {
			multiplicacion = multiplicacion +a;
				
		}
		
		return multiplicacion;
		
	}
	
	public double multiplicar(String numero) {
		
		double multiplicacion = 0.0;
		
		try {
		
			multiplicacion = Integer.parseInt(numero) * 10;
		
		} catch(Exception ex) {
		
			System.out.println("Error");
			
		}
		return multiplicacion;
	}
	

}
