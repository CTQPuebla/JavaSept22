package com;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("01", "cv1", 3000.0, 2000.00, 30000.00, new Date(), true);
		Cuenta c2 = new Cuenta("02", "cv2", 5000.0, 1000.00, 15000.00, new Date(), true);
		Cuenta c3 = new Cuenta("03", "cv3", 400.0, 50.00, 10000.00, new Date(), true);
		Cuenta c4 = new Cuenta("04", "cv4", 1500.0, 200.00,8000.00, new Date(), true);
		
		//Cajero
		Cajero cajero = new Cajero("Juarez","1");
		
		//System.out.println( cajero.depositar(c4, 6500) );
		
		System.out.println(cajero.retirar(c2,3000));
		System.out.println(cajero.retirar(c3, 10));
		System.out.println(cajero.retirar(c4, 20));
		System.out.println(cajero.transferir(c1, c3, 50));

	}

}
