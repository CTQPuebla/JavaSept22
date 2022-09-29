package com;

public class Laptop {
	double pantalla, camara;
	int almacenamiento, bateria, puertosUsb;
	String fabricante, color, sistemaOperativo, teclado;
	boolean hdmi, vga;

	public Laptop() {

	}

	public Laptop(double pantalla, double camara, int almacenamiento, int bateria, int puertosUsb, String fabricante,
			String color, String sistemaOperativo, boolean hdmi, boolean vga, String teclado) {
		super();
		this.pantalla = pantalla;
		this.camara = camara;
		this.almacenamiento = almacenamiento;
		this.bateria = bateria;
		this.puertosUsb = puertosUsb;
		this.fabricante = fabricante;
		this.color = color;
		this.sistemaOperativo = sistemaOperativo;
		this.hdmi = hdmi;
		this.vga = vga;
		this.teclado = teclado;
	}

	protected double getPantalla() {
		return pantalla;
	}

	protected void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}

	protected double getCamara() {
		return camara;
	}

	protected void setCamara(double camara) {
		this.camara = camara;
	}

	protected int getAlmacenamiento() {
		return almacenamiento;
	}

	protected void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	protected int getBateria() {
		return bateria;
	}

	protected void setBateria(int bateria) {
		this.bateria = bateria;
	}

	protected int getPuertosUsb() {
		return puertosUsb;
	}

	protected void setPuertosUsb(int puertosUsb) {
		this.puertosUsb = puertosUsb;
	}

	protected String getFabricante() {
		return fabricante;
	}

	protected void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected String getSistemaOperativo() {
		return sistemaOperativo;
	}

	protected void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	protected boolean isHdmi() {
		return hdmi;
	}

	protected void setHdmi(boolean hdmi) {
		this.hdmi = hdmi;
	}

	protected boolean isVga() {
		return vga;
	}

	protected void setVga(boolean vga) {
		this.vga = vga;
	}

	protected String getTeclado() {
		return teclado;
	}

	protected void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	@Override
	public String toString() {
		return "Laptop [pantalla=" + pantalla + ", camara=" + camara + ", almacenamiento=" + almacenamiento
				+ ", bateria=" + bateria + ", puertosUsb=" + puertosUsb + ", fabricante=" + fabricante + ", color="
				+ color + ", sistemaOperativo=" + sistemaOperativo + ", teclado=" + teclado + ", hdmi=" + hdmi
				+ ", vga=" + vga + "]";
	}

}
