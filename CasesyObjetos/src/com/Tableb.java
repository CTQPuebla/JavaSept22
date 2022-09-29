package com;

public class Tableb {

	/*1
	 * color---String
	 * largo----double
	 * ancho-----double
	 * materiales------ Sting
	 * merca------ String
	 * componentes-------String
	 * botones-----int
	 * sistema operativo----string
	 */
	//Atributos
	String color,marca,materiales;
	double largo,ancho;
	int botones;
	// Atributos de objetos
	
	Camara camara;
	Almasenamiento almasenamiento;	
		
	//constructor
	
public Tableb(String color, String marca, String materiales, String sistemaoperativo, double largo, double ancho,
			int botones, Camara camara, Almasenamiento almasenamiento) {
		
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
		this.camara = camara;
		this.almasenamiento = almasenamiento;
	}
//setter - entrada (establese un valor en un atributo)
	//1Voin - no devuelble nada 
	public void setColor(String color) {
    this.color= color;

}
        //Getter - Salida (devuelve un valor)

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}


	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public Almasenamiento getAlmasenamiento() {
		return almasenamiento;
	}

	public void setAlmasenamiento(Almasenamiento almasenamiento) {
		this.almasenamiento = almasenamiento;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Tableb [color=" + color + ", marca=" + marca + ", materiales=" + materiales
				 + ", largo=" + largo + ", ancho=" + ancho + ", botones=" + botones + ", camara="
				+ camara + ", almasenamiento=" + almasenamiento + "]";
	}
	
	
	
	
}

