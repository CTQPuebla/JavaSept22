package com;

public class Destornillador {

		String material, tipo;
		double tama�o;
		
		public Destornillador() {
			
		}

		public Destornillador(String material, String tipo, double tama�o) {
			super();
			this.material = material;
			this.tipo = tipo;
			this.tama�o = tama�o;
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

		public double getTama�o() {
			return tama�o;
		}

		public void setTama�o(double tama�o) {
			this.tama�o = tama�o;
		}

		@Override
		public String toString() {
			return "Destornillador [material=" + material + ", tipo=" + tipo + ", tama�o=" + tama�o + "]";
		}
		
}
