package com;

public class Hexageno extends FigurasGeo implements ICalculos {
        double lado;
        double apotema;
        
        
        public Hexageno() {
        	
        }
        
		public Hexageno(double lado, double apotema) {
			super();
			this.lado = lado;
			this.apotema = apotema;
		}
		


		public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		public double getApotema() {
			return apotema;
		}

		public void setApotema(double apotema) {
			this.apotema = apotema;
		}
		

		@Override
		public String toString() {
			return "Hexageno [lado=" + lado + ", apotema=" + apotema + "]";
		}

		@Override
		public double area() {
			// TODO Auto-generated method stub
			double apotema = (Math.sqrt(3*lado)) / 2;
			  return 3*lado*apotema;
		}


		@Override
		public double volumen() {
			// TODO Auto-generated method stub
			return this.area()*lado;
		}


		@Override
		public double perimetro() {
			// TODO Auto-generated method stub
			return 6*lado;
		}
        
        
}
