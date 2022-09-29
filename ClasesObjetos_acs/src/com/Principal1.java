package com;

public class Principal1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		//crear el objeto
		
		Automovil A1 = new Automovil();
		System.out.println(A1);
		
		A1.setColor("Blanco");
		A1.setMarca("Ibiza");
		A1.setLargo(200.5);
		A1.setComponentes("neumaticos");
		A1.setMaterial("Aluminio");
		A1.setPuertas(4);
		A1.setModelo(2019);
		A1.setAncho(89);
		
		System.out.println(A1);
		// generate toString
		Automovil A2 = new Automovil("Rojo", "Aveo", "Auminio", "Aire acondicionado", 194, 80, 2017, 4);
		System.out.println(A2);
		
		System.out.println(A2.getPuertas()); //cuales son los componentes del objetos t2
	}

}
