package com;

public class Lupa {

	int power;
	double ratio;
	String material;
	
	public Lupa() {
		
	}

	public Lupa(String material, int power, double ratio) {
		
		this.material = material;
		this.power = power;
		this.ratio = ratio;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Lupa [power=" + power + ", ratio=" + ratio + ", material=" + material + "]";
	}

	
	
	
}
