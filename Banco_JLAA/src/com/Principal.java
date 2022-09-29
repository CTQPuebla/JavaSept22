package com;
import java.util.Date;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CUENTAS
		Cuenta c1= new Cuenta("01", "cv1", 3800.00, 2000.00, 30000.00, new Date(), 1);
		Cuenta c2= new Cuenta("02", "cv2", 5000.00, 2000.00, 15000.00, new Date(), 1);
		Cuenta c3= new Cuenta("03", "cv3", 400.00, 50.00, 10000.00, new Date(), 1);
		Cuenta c4= new Cuenta("04", "cv4", 1500.00, 2000.00, 8000.00, new Date(), 1);
						
		//CAJERO
		
		Cajero cajero= new Cajero("1", "Juárez");
//		System.out.println(cajero.depositar(c4, 6500));
	
		
		System.out.println(cajero.retirar(c2, 3000));
		System.out.println(cajero.depositar(c3, 10));
		System.out.println(cajero.retirar(c4, 20));
		System.out.println(cajero.transferir(c1,c3, 1500));

		
	}

}
