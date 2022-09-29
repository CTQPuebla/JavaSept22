package com;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta c1 = new Cuenta("01", "vv1", 3800.00, 2000.00, 30000.00, 1,new Date());
		Cuenta c2 = new Cuenta("02", "vv2", 5000.00, 1000.00, 15000.00, 1, new Date());
		Cuenta c3 = new Cuenta("03", "vv3", 400.00, 50.00, 10000.00, 1, new Date());
		Cuenta c4 = new Cuenta("04", "vv4", 1800.00, 200.00, 8000.00, 1, new Date());

		//cajero
		Cajero cajero = new Cajero("1","Juarez");
		
		//System.out.println(cajero.depositar(c1, 8000));
		System.out.println(cajero.retirar(c2, 3000));
		System.out.println(cajero.retirar(c3, 10));
		System.out.println(cajero.retirar(c4, 20));
		System.out.println(cajero.retirar(c1, 1500));
	}

}
