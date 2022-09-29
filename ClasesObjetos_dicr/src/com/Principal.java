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
	t1.setAncho(8);  // el set inyecta al objeto
	
	System.out.println(t1);
	
	Tablet t2 = new Tablet("Plata", "Asus", "Aluminio", 10.5, 5.1, 3);
	System.out.println(t2);
	
	//Objetos que forman parte de Tablet
	 Camara c1 = new Camara(20, 5, 2.5);
	 Almacenamiento a1 = new Almacenamiento("Qualcom", 32);
	 
	 Tablet t3 = new Tablet("Azul", "Samsung", "Plastico", 15, 7, 3, c1, a1);
	 System.out.println(t3);
	 
	//System.out.println(t2.getComponentes()); //el get extraes un atributo del objeto */
		
		
	/*	Hogar h1 = new Hogar();
		System.out.println(h1); //asignando sin valores
		
		h1.setColor("Rosa"); //.set --Asigna los valores--
		h1.setCuartos(5);
		h1.setBaños(4);
		h1.setMateriales("Concreto");
		h1.setPuertas(8);
		h1.setVentanas(10);
		h1.setAncho(15.5);
		h1.setLargo(20.2);
		
		System.out.println(h1);
		
		Hogar h2 = new Hogar ("Morado", "Madera", 4, 4, 2, 2, 13.2, 15.5);
		System.out.println(h2); //manda a imprimir como mandamos a llamar el objeto
		System.out.println(h2.getMateriales()); */
	} 
		
		

}
