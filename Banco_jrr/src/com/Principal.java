package com;

import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		// Cuentas
		Cuenta c1 = new Cuenta("01", "cv1", 3800.00, 2000, 30000, new Date(), 1);
		Cuenta c2 = new Cuenta("02", "cv2", 5800.00, 1000, 15000, new Date(), 1);
		Cuenta c3 = new Cuenta("03", "cv3", 400.00, 50, 10000, new Date(), 1);
		Cuenta c4 = new Cuenta("04", "cv4", 1500.00, 200, 8000, new Date(), 1);

		// Cajero
		Cajero cajero = new Cajero("1", "Juárez");

		//System.out.println(cajero.depositar(c4, 8001));		
		//System.out.println(cajero.depositar(c4, 5000));
		//System.out.println(cajero.depositar(c4, 6501));
		//System.out.println("***** ***** ***** ***** *****");
		
		
		//System.out.println(cajero.retirar(c1, 8000));
		System.out.println(cajero.retirar(c2, 3000));
		System.out.println("***** ***** ***** ***** *****");
		System.out.println(cajero.retirar(c3, 10));
		System.out.println("***** ***** ***** ***** *****");
		System.out.println(cajero.retirar(c4, 20));
		System.out.println("***** ***** ***** ***** *****");
		//System.out.println(cajero.depositar(c1, 1500));
		System.out.println(cajero.transferir(c1, c2, 1500));

	}
}
