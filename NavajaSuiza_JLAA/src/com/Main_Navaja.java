package com;

public class Main_Navaja {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Sacacorchos s1= new Sacacorchos("Sacacorchos de dos tiempos", "Rojo");
				Pinzas p1= new Pinzas("Mordaza curva", "Cortar");
				PelaCables pc1= new PelaCables(10, 8, "Pelacables de seguridad para cables coaxiles");
				NavajaSuiza ns1= new NavajaSuiza("Victorinox", "Plata", s1, p1, pc1);
				
				System.out.println(ns1);
	}

}
