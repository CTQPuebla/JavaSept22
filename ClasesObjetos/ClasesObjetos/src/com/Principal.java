package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//crear objeto
		Tablet t1 = new Tablet();
		
		System.out.println(t1);
		
		t1.setMarca("lenovo");
		t1.setColor("rojo");
		t1.setLargo(12.3);
		t1.setMateriales("lamina");
		t1.setBotones(1);
		t1.setAncho(8);
		
		System.out.println(t1);
		
//		Tablet t2 = new Tablet("plata", "plomo", "asus", "camara, touch", 23.5, 12.0, 3);
//		System.out.println(t2);
		
		Camara c1 = new Camara(20, 5, 2.6);
		Almacenamiento a1 = new Almacenamiento("Qualcom", 32);
		
		
        Tablet t3 = new Tablet("Azul", "Samsung","Plastico", 15, 7, 3, c1, a1);
        
        System.out.println(t3);
	}

}
