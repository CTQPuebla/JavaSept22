package com;

public class Circulo extends Figura {

	  int radio;
	  
	  public Circulo() {
		  
	  }

	public Circulo( int radio) {
		super();
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	public double perimetro () {
    	return Math.PI*(Math.pow(2,radio));	
    }
    public double area () {
    	return Math.PI*(Math.pow(radio, 3));
    }
    public double volumen () {
    	return 1.33*(Math.PI*(Math.pow(radio, 3)));
    }
}
