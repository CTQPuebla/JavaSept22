package com;

public class Lupa {
	double diametro, aumento;

	public Lupa() {
	}

	public Lupa(double diametro, double aumento) {
		this.diametro = diametro;
		this.aumento = aumento;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}

	@Override
	public String toString() {
		return "Lupa [diametro=" + diametro + ", aumento=" + aumento + "]";
	}

}
