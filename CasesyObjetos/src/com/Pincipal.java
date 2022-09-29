package com;

public class Pincipal {

	public static void main(String[] args) {
		
		
		// crear el objeto
		
		Tableb t1 = new Tableb(null, null, null, null, 0, 0, 0, null, null);
		
		System.out.println(t1);
		t1.setMarca("Lenovo");
		t1.setColor("Negro");
		t1.setLargo(12.5);
		t1.setMateriales("Metal");
		t1.setBotones(1);
		t1.setAncho(8);
		
		System.out.println(t1);
		
		Tableb t2 = new Tableb("Plata", "Asus", "Aluminio", null, 10.5, 5.1, 3, null, null);
	System.out.println(t2);
	
	Camara c1 = new Camara(20,5,2.6);
      Almasenamiento a1 =new Almasenamiento ("Qualcom",32);
      
      Tableb t3 = new Tableb  ("Azul", "Asus", "platico",null, 15.5,18.3 , 3, c1, a1);
	}
	
	

}
