package com;

public class Principal {

	public static void main(String[] args) {
		// Crear el objeto
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

		Camara c1 = new Camara(20, 5, 2.6);
		Almacenamiento a1 = new Almacenamiento("Qualcomm", 32);

		Tablet t3 = new Tablet("Azul", "Samsung", "Plastico", 15, 7, 3, c1, a1);

		System.out.println(t3);
		

//		Laptop dell = new Laptop();
//		System.out.println(dell);
//
//		dell.setAlmacenamiento(240);
//		dell.setCamara(4);
//		dell.setSistemaOperativo("Windows 10");
//		dell.setPuertosUsb(4);
//		dell.setVga(true);
//		dell.setHdmi(true);
//		dell.setFabricante("dell");
//
//		System.out.println(dell);
//
//		Laptop hp = new Laptop(14.1,5,500,4000,3,"hp","negro","Windows 11",true,false,"ingles");
//		System.out.println(hp);

	}

}
