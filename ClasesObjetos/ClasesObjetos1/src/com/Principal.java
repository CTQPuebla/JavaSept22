package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Laptop t1 = new Laptop();
		
		System.out.println(t1);
		
		t1.setBrand("lenovo");
		t1.setColor("black");
		t1.setScreenSize(12.3);
		t1.setMaterials("steel");
		t1.setSsdiCap(256);
		t1.setRamCap(8);
		
		System.out.print(t1);

		Laptop t2 = new Laptop("plata", "plomo", "asus", 23.5, 12, 8);
//		System.out.println(t2);
		
	System.out.println(t2.getRamCap());
	

	}

}
