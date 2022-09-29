package com;

public class Principal {

	public static void main(String[] args) {
//		//crear el objeto
//		
		Tablet t1 = new Tablet();
		
		System.out.println(t1);

		t1.setMarca("Lenovo");
		t1.setColor("Negro");
		t1.setLargo(12.5);
		t1.setMateriales("Metal");
		t1.setBotones(1);
		t1.setAncho(8);
		System.out.println(t1);
		
		
		Tablet t2 = new Tablet("Plata", "Asus","Aluminio", 10.5, 5.1, 3);
		System.out.println(t2);
		
		
		//crear un atributo objeto
		Camara c1 = new Camara(20, 5, 2.6);
		Almacenamiento a1 = new Almacenamiento("Qualcom",32);
		
		Tablet t3 = new Tablet("Azul","Samsung", "Plastico",15,7,3,c1,a1);
		System.out.println(t3);

		
		
		
	
        //crear el objeto
//	Casa c1 = new Casa ();
//	System.out.println(c1);
//	//con .set le asignas valores
//	c1.setMaterial("Concreto");
//	c1.setColor("Rosa");
//	c1.setCuartos(3);
//	c1.setBaños(2);
//	c1.setVentanas(5);
//	c1.setPuertas(2);
//	c1.setLargo(40);
//	c1.setAncho(40);
//	 
//	System.out.println(c1);//imprime el objeto con los nuevos atributos
//	
//	//crea el objeto2 "c2"
//	
//	Casa c2 = new Casa ("Madera","Amarilla",2,1,2,1,30,30);//COMO TAL EL ORDEN EN LA LINEA 12 DE LA CLASE CASA
//	System.out.println(c2);
//	System.out.println(c2.getColor());
	
}
}