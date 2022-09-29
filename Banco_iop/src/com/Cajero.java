package com;

import java.util.Date;

public class Cajero {

	String id, ubicacion;
	int conteo;

	public Cajero() {
	}

	public Cajero(String id, String ubicacion) {
		this.id = id;
		this.ubicacion = ubicacion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", ubicacion=" + ubicacion;
	}

	public Ticket depositar(Cuenta cuenta, double monto) {
		Ticket t = null;

		// Valida que la cantidad por si sola no se pase del maximo
		if (cuenta.getMax() < monto) {
			System.out.println("Cantidad excede maximo permitido");
			return t;
		} else if ((cuenta.getSaldo() + monto) > cuenta.getMax()) {
			System.out.println("Depostio excederia el maximo permitido");
			return t;
		} else {
			cuenta.setSaldo(cuenta.getSaldo() + monto);

			return new Ticket(new Date(), cuenta.getSaldo() - monto, cuenta.getSaldo(), monto, cuenta.getId(),
					ubicacion, conteo, Integer.parseInt(id));

		}

	}

	public Ticket retirar(Cuenta cuenta, double montoR) {
		Ticket t = null;
		// The account has enough money
		if (cuenta.getSaldo() < montoR) {
			System.out.println("Saldo insuficiente");
			return t;
		//The new balance its less than the minimum of the account
		} else if ((cuenta.getSaldo() - montoR) < cuenta.getMin()) {
			System.out.println("El retiro dejaria por de bajo el saldo minimo de la cuenta");
			return t;
		} else {
			cuenta.setSaldo(cuenta.getSaldo() - montoR);
			conteo++;
			return new Ticket(new Date(), cuenta.getSaldo() + montoR, cuenta.getSaldo(), montoR, cuenta.getId(),
					ubicacion, conteo, Integer.parseInt(id));
		}

	}

	public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {
		Ticket t = null;
		
		if (origen.getSaldo() < monto) {
			System.out.println("Saldo insuficiente");
			return t;
		//Retiro de la cuenta origen 
		} else if ((origen.getSaldo() - monto) < origen.getMin()) {
			System.out.println("El retiro dejaria por de bajo el saldo minimo de la cuenta");
			return t;
			//Deposito a la cuenta destino
		}else if (destino.getMax() < monto) {
			System.out.println("Cantidad excede maximo permitido");
			return t;
		} else if ((destino.getSaldo() + monto) > destino.getMax()) {
			System.out.println("Depostio excederia el maximo permitido");
			return t;
		}else { 
			//Transferencia
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			conteo++;
		}
		
		return new Ticket(new Date(), destino.getSaldo() - monto, destino.getSaldo(), monto, destino.getId(),
				ubicacion, conteo, Integer.parseInt(id));

	}
	
	public double checarSaldo(Cuenta cuenta) {
		
		return cuenta.getSaldo();
		
	}
}
