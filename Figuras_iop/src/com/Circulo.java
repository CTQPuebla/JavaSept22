package com;

public class Circulo extends Figuras implements ICalculos {

	    private double radio;
	    private double altura;

	    public Circulo() {
	    	
	    }


		public Circulo(double perimetro, double radio, double altura) {
			super(perimetro);
			this.radio = radio;
			this.altura = altura;
			// TODO Auto-generated constructor stub
		}

		

		public double getRadio() {
			return radio;
		}


		public void setRadio(double radio) {
			this.radio = radio;
		}


		public double getAltura() {
			return altura;
		}


		public void setAltura(double altura) {
			this.altura = altura;
		}


		@Override
		public double area() {
			// TODO Auto-generated method stub
			return Math.PI * (Math.pow(radio, 2));
		}


		@Override
		public double volumen() {
			// TODO Auto-generated method stub
			return Math.PI * (Math.pow(radio, 2))*altura;
		}


		@Override
		public double perimetro() {
			return 2*Math.PI*radio; 
		}
	    
	    
	    
	    
		











	    
}
