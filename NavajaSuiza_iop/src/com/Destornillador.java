package com;

public class Destornillador {

		String material, tipo;
		double tamaño;
		
		public Destornillador() {
			
		}

		public Destornillador(String material, String tipo, double tamaño) {
			super();
			this.material = material;
			this.tipo = tipo;
			this.tamaño = tamaño;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getTamaño() {
			return tamaño;
		}

		public void setTamaño(double tamaño) {
			this.tamaño = tamaño;
		}

		@Override
		public String toString() {
			return "Destornillador [material=" + material + ", tipo=" + tipo + ", tamaño=" + tamaño + "]";
		}
		
}
