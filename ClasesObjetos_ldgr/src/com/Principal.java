package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//Crear el objeto
		
		Tablet t1 = new Tablet();
		System.out.println(t1);
		
		t1.setMarca("Lenovo");
		t1.setColor("Negro");
		t1.setLargo(12.5);
		t1.setMateriales("Metal");
		t1.setBotones(1);
		t1.setAncho(8);
		
		System.out.println(t1);
		
		Tablet t2 = new Tablet("Plata", "Asus", "Aluminio", 10.5, 5.1, 3);
		System.out.println(t2);
		//objetos que forman parte de la tablet
		Camara c1 = new Camara (20, 5, 2.6);
		Almacenamiento  a1 = new Almacenamiento("Qualcom", 32);
		
		Tablet t3 = new Tablet("Azul", "Samsung", "Plastico", 15, 7 ,3, c1, a1);
		System.out.println(t3);
	}

}
