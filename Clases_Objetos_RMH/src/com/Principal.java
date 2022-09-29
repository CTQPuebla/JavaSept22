package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crea el objeto
		//T1 es la referencia 
		Tablet t1 = new Tablet();
		System.out.println(t1);
		
		t1.setMarca("Lenovo");
		t1.setColor("Negro");
		t1.setLargo(12.5);
		t1.setMateriales("Metal");
		t1.setBotones(1);
		t1.setAncho(8);//Los valores estan llegando a los objetos
		
		System.out.println(t1);
		//Hay que ser ordenados(linea 21 = crea el objeto)
		Tablet t2 = new Tablet("Plata", "Alumnio", "Asus", "Android", 15, 7, 3);//t2 es el nombre del objeto
		//ver sus "componentes" del objeto t2
		System.out.println(t2);
		//Las clases son modelos donde crearas objetos, las clases se componen de atributos y de metodos(comportamiento)
		
		//Creando Objeto(Objetos que forman parte de tablet)
		Camara c1 = new Camara(20, 5, 2.6);
		Almacenamiento a1 = new Almacenamiento("Qualcom",32);
		
		Tablet t3 = new Tablet("Azul", "Plastico", "Samsung", "Apple", 15, 7, 4, c1, a1);
		System.out.println(t3);
		
		/*------------------------------------------------------------------*/
		//Modelar una clase y dos objetos de esa clase 
		
		//Crear el objeto
		/*Carro c1 = new Carro();
		System.out.println(c1);//Imprime los atributos de esa clase
		//con .set le asignas valores
		c1.setAño(2019);
		c1.setColor("Azul");
		c1.setMarca("BMW");
		c1.setModelo("M3");
		c1.setPuertas(2);
		
		System.out.println(c1);//Imprime el objeto con los nuevos atributos 
		
		//Crea otro objeto"c2"
		Carro c2 = new Carro("Audi","TT","Plata",2020,4);//CUIDADO CON EL ORDEN (ver linea 13 de la clase carro)
		System.out.println(c2);
		System.out.println(c2.getAño());*/

	}

}
