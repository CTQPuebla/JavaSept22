package com;

public class Claseprueba {
	// Atributos
	
	 public String atributoA;
	private int atributosB;
	 protected double atributoC;
	//Atributo de clase
	public static String atributoD="Valor";
	
//	public static String MENSAJE="NO PUEDO CAMBIAR";
	//variables van en minuisculas siempre
	 
	public Claseprueba() {
		
	}

	public Claseprueba(String atributoA, int atributosB, double atributoC) {
		
		this.atributoA = atributoA;
		this.atributosB = atributosB;
		this.atributoC = atributoC;
	}

	public String getAtributoA() {
		return atributoA;
	}

	public void setAtributoA(String atributoA) {
		this.atributoA = atributoA;
	}

	public int getAtributosB() {
		return atributosB;
	}

	public void setAtributosB(int atributosB) {
		this.atributosB = atributosB;
	}

	public double getAtributoC() {
		return atributoC;
	}

	public void setAtributoC(double atributoC) {
		this.atributoC = atributoC;
	}

	@Override
	public String toString() {
		return "Claseprueba [atributoA=" + atributoA + ", atributosB=" + atributosB + ", atributoC=" + atributoC + "]";
	}
	public  void ImprimirMensaje() {//-----metodo es un comportamiento propio
		System.out.println("Ipresion desde la clase prueba");
	}
	
    public int multiplicar(int a,int b) {
    	return a*b;
    }
    public double multiplicar(double a,int b) {
    	double multiplicacion =0.0;
    	 for(int i =0; i<b; i ++) {
    		 multiplicacion = multiplicacion +a;
    	 }
    	
    	 return multiplicacion;
    }
   public double multiplicar(String numero) {
	   double multiplicacion =0.0;
	   try {
		   multiplicacion = Integer.parseInt(numero)*10;
	   }catch(Exception ex ) {
		   System.out.println("error");
	  }
	   return multiplicacion;
   }
    
    
}//class
