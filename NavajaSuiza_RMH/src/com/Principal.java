package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear objeto
		NavajaSuiza n1 = new NavajaSuiza();
		
		//Inyecto valores
		n1.setAltura(0.8);
		n1.setLongitud(3.6);
		n1.setMarca("Victorinox Ejército Suizo");
		n1.setMaterial("Acrilonitrilo Butadieno Estireno");
		n1.setPeso(3.4);
		System.out.println(n1);
		//Creando objetos de mis clases
		Destornillador d1 = new Destornillador("Aluminio","Cruz",3);
		Cuchillas c1 = new Cuchillas("Metal",2.9);
		Abrebotellas a1 = new Abrebotellas("Metal",2.5);
		//Creo objeto con todos los atributos
		NavajaSuiza n2 = new NavajaSuiza(0.9,3.5,3.5,"Victorinox","Acrilonitrilo",d1,c1,a1);
		System.out.println(n2);

	}

}
