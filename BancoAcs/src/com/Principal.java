package com;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		//cuenta
		//(String id, String clave, Date fechaApertura, double saldo, double min, double max, String status) {
		Cuenta c1 = new Cuenta("01", "CV1", new Date(), 3800, 1000, 30000, "1");
		Cuenta c2 = new Cuenta("02", "CV2", new Date(), 5000, 1000.00, 15000, "1");
		Cuenta c3 = new Cuenta("03", "CV3", new Date(), 400, 50.0, 10000, "1");
		Cuenta c4 = new Cuenta("04", "CV4", new Date(), 1500.00, 200.00, 8000.00, "1");
		
		
		//Cajero
		Cajero cajero = new Cajero(1, "Juárez");
	
		//System.out.println(cajero.depositar(c1, 10000));
		
		System.out.println(cajero.retirar(c2, 3000));
		System.out.println(cajero.depositar(c3,  10));
		System.out.println(cajero.retirar(c4,  20));
		System.out.println(cajero.transferir(c1, c3, 1500));
	}
}
