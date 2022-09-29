package com;
//Le agregamos el mdificador final
public  /*final*/ class ClasePrueba {
	//modificadores de acceso
	public String atributoA;//Atributo instancia
	private int atributoB;
	protected double atributoC;
	
	//-------modificadores de comportamiento--------
	//Atributo de clase
	public static String atributoD="VALOR";//Definir atributos de clase
	//final lo hace inmutable
	public static final String MENSAJE="NO PUEDO CAMBIAR";//MAYUSCULAS valor constantes
	
	
	//constructor vacio
	public ClasePrueba() {
		
	}

	//Gneramos contructor con atributos
	public ClasePrueba(String atributoA, int atributoB, double atributoC) {
		super();//Llamad a su clase padre
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.atributoC = atributoC;
	}

	//Genarramos getter and setter
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

	//Gerenamos to string
	@Override
	public String toString() {
		return "ClasePrueba [atributoA=" + atributoA + ", atributoB=" + atributoB + ", atributoC=" + atributoC + "]";
	}
	//Es un metodo //Comportamiento propio
	//El metodo es nativo de la clase prueba
	//Se le agrego final (ya no te  deja sobrescribir override)
	public /*final*/ void imprimirMensaje() {
		
		System.out.println("Impresion desde la clase Prueba");
	}
	//Meetodos que devuelven algo tiene que llevar un return menos los void
	//NO PUEDES HACER UN METODO DENTRO DE OTRO
	public int multiplicar(int a, int b) {
		
		
		return  a*b;
	}
	
	public double multiplicar(double a, int b) {
		double mult = 0.0;
		for (int i = 0; i < b; i++) {
			mult = mult +a;
		}
		
		return mult;
	}
	//3er variacion del metodo multiplicar
	public double multiplicar(String numero) {
		
		double mult = 0.0;
		try {
			mult = Integer.parseInt(numero)*10;
		}catch(Exception ex) {
			System.out.println("ERROR");
		}
		
		return mult;
	}

}
