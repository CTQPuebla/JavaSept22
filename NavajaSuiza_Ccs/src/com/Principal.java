package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Navaja navaja1 = new Navaja("Victorinox", "Negro", 20);
		
		System.out.println(navaja1);
		
		Tijeras T1 = new Tijeras(15, "Corte de papel", "Acero");
		Alicate A1 = new Alicate(18, "Corte de cable", "Acero");
		Destornillador D1 = new Destornillador(18, "De cruz", "Acero");
		
		Navaja navaja2 = new Navaja("Victorinox", "Rojo", 20, D1, T1, A1);
		System.out.println(navaja2);

	}

}
