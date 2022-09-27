package com;

public class NavajaSuiza {
	
	String modelo;
	String precio;
	String color;
	String tamaño;
    Componentes componentes;
    Material material;
    
    public NavajaSuiza () {
    	
    }

	public NavajaSuiza(String modelo, String precio, String color, String tamaño, Componentes componentes,
			Material material) {
		super();
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.tamaño = tamaño;
		this.componentes = componentes;
		this.material = material;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public Componentes getComponentes() {
		return componentes;
	}

	public void setComponentes(Componentes componentes) {
		this.componentes = componentes;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [modelo=" + modelo + ", precio=" + precio + ", color=" + color + ", tamaño=" + tamaño
				+ ", componentes=" + componentes + ", material=" + material + "]";
	}
    
}
