package com;

public class Principal {
	public static void main(String[] args) {
		
		Componentes c1 = new Componentes ("Tipo vendimia", "Inoxidables", "Tipo cruz");
		Material m1 = new Material ("Pino", "Inoxidable", "Ligero");
		NavajaSuiza sn = new NavajaSuiza ("Spartan", "Caro", "Rojo", "Grande", c1, m1);
		System.out.println(sn);
		
		
		
		
		
		
		
	}

}
