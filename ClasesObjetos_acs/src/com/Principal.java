package com;

public class Principal {

		public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		//crear el objeto
		
		Table t1 = new Table();
		System.out.println(t1);
		
		t1.setMarca("Lenovo");
		t1.setColor("Negro");
		t1.setLargo(12.5);
		t1.setMateriales("Metal");
		t1.setBotones(1);
		t1.setAncho(8);
		
		
		System.out.println(t1);
		
		Table t2 = new Table("plata", "asus", "aluminio", 10.5, 5.1, 3);
		System.out.println(t2);
		
		//Crear un objeto para agregar otro constructor 	->Objetos que forman parte de Table
		Camara c1 = new Camara(20, 5, 2.6);
		Almacenamiento a1 = new Almacenamiento("Qualcom", 32);
		
		Table t3 = new Table("Azul", "Samsung","Plastico", 15, 7, 3, c1, a1);
		System.out.println(t3);
		
		
		System.out.println(t2.getColor()); //cuales son los componentes del objetos t2
	}

}
