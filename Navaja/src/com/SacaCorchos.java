package com;

public class SacaCorchos {
	
	int large;
	String meterial;
	
	public SacaCorchos() {
		
	}

	public SacaCorchos(int large, String meterial) {
		
		this.large = large;
		this.meterial = meterial;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	public String getMeterial() {
		return meterial;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return "SacaCorchos [large=" + large + ", meterial=" + meterial + "]";
	}
	
	 

}
