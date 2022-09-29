package com;

public class Principal extends Tablet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREAR OBJETO
		Tablet t1= new Tablet ();
		System.out.println(t1);
		
		t1.setMarca("HP");
		t1.setColor("Azul");
		t1.setLargo(12.5);
		t1.setAncho(8);
		t1.setMateriales("Metal");
		t1.setBotones(1);
		System.out.println(t1);
		
		
	Tablet t2 = new Tablet("Blanco", 20, 10, "Aluminio", "Apple", 2);
	System.out.println(t2);
		
		Camara c1= new Camara(20, 5, 2.6);
		
		Almacenamiento a1= new Almacenamiento(32, "Qualcom");
		
		Tablet t3= new Tablet("Azul", 10, 5, "Metal", "HP", 2, c1, a1);
		
		System.out.println(t3);

		
	}
	

}
