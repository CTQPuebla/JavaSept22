package com;

import java.util.Date;

public class Principal {
	
	public static void main(String[] args) { 
		
		Cuenta c1= new Cuenta("01", "CV1", 3000, 2000.0, 30000.0, new Date(), 1);
		Cuenta c2= new Cuenta("02", "CV2", 5000, 1000.0, 15000.0, new Date(), 1);
		Cuenta c3= new Cuenta("03", "CV3", 400, 50.0, 10000.0, new Date(), 1);
		Cuenta c4= new Cuenta("04", "CV4", 1500, 200.0, 8000.0, new Date(), 1);
		
		Cajero cajero = new Cajero("1", "Puebla");
		
//		System.out.println(Cajero.depositar(c4, 5000));
		System.out.println(cajero.retirar(c1, 1500));
		System.out.println(cajero.retirar(c2, 3000));
		System.out.println(cajero.retirar(c3, 10));
		System.out.println(cajero.retirar(c4, 20));
		
		
	}
}
