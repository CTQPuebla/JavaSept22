package com;

public class ClasePrueba {
	
	
	public String atributoA;
    private int atributoB;
    protected double atribuctoC;
    
    //Atributo de clase
    public static String atributoD = "Valor";
    public static String MENSAJE = "NO PUEDO CAMBIAR";
    
    public ClasePrueba () {
    	
    }

	public ClasePrueba(String atributoA, int atributoB, double atribuctoC) {
		
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.atribuctoC = atribuctoC;
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

	public double getAtribuctoC() {
		return atribuctoC;
	}

	public void setAtribuctoC(double atribuctoC) {
		this.atribuctoC = atribuctoC;
	}

	@Override
	public String toString() {
		return "ClasePrueba [atributoA=" + atributoA + ", atributoB=" + atributoB + ", atribuctoC=" + atribuctoC + "]";
	}
    public void ImprimirMensaje() {
    	System.out.println("Impresión desde la clase Prueba");
		
	}
    public int multiplicar (int a, int b) {
    	
    	return a*b;
    }
    public double multiplicar (double a, int b) {
    	double multiplicacion =0.0;
    	for (int i = 0; i < b; i++) {
			multiplicacion = multiplicacion +a;
		}
    	
    	return multiplicacion;
    }
public double multiplicar (String numero) {
		
		double multiplicacion = 0.0;
		
		try {
			multiplicacion = Integer.parseInt(numero)*10;
		}
		catch (Exception ex) {
			System.out.println("Error");
		}
		return multiplicacion;
	}
public void imprimirMensaje () {
	System.out.println("Este es otro mensaje"+(10+50));
}
}
