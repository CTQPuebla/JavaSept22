package com;

import java.util.Date;

public class Cajero {
	
	String ID, ubicacion;
	int conteo;
	public void cajero() {
		
	}

	public Cajero(String iD, String ubicacion) {
		super();
		ID = iD;
		this.ubicacion = ubicacion;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Cajero [ID=" + ID + ", ubicacion=" + ubicacion + "]";
	}
	
	public Ticket depositar(Cuenta cuenta, double monto) {
		Ticket t = null;
		
		//Valida que la cantidad por si sola no se pase del maximo
		if(cuenta.getMax()<monto) {
			System.out.println("cantidad excede maximo permitido");
			return t;
		}else if ((cuenta.getSaldo()+monto)>cuenta.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
			return t;
			
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			conteo++;
			return new Ticket(new Date(),
					cuenta.getSaldo()-monto,
					cuenta.getSaldo(),
					monto, cuenta.getId(), ubicacion, conteo, Integer.parseInt(ID));
			
			
			
		}
		
	}
	
	
	public Ticket retirar(Cuenta cuenta, double monto) {
		Ticket t = null;
		//Que tenga suficiente dinero
		if(cuenta.getSaldo()<monto) {
			System.out.println("sin fondos suficientes");
			return t;
			
		} else if((cuenta.getSaldo()-monto)<cuenta.getMin()) {
			System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			return t;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			conteo++;
			return new Ticket(new Date(),
					cuenta.getSaldo()-monto,
					cuenta.getSaldo(),
					monto, cuenta.getId(), ubicacion, conteo, Integer.parseInt(ID));
			
			
		}
		
	}
	public Ticket transferir(Cuenta origen, Cuenta destino, double monto ) {
		Ticket t = null;
		if(origen.getSaldo()<monto) {
			System.out.println("sin fondos suficientes");
			return t;
			
		} else if((origen.getSaldo()-monto)<destino.getMin()) {
			System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			return t;
		}if(destino.getMax()<monto) {
			System.out.println("cantidad excede maximo permitido");
			return t;
		}else if ((destino.getSaldo()+monto)>destino.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
			return t;
			
		}else {
			//Transferencia
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			conteo++;
			
			return new Ticket(new Date(),
					destino.getSaldo()-monto,
					destino.getSaldo(),
					monto, destino.getId(), ubicacion, conteo, Integer.parseInt(ID));
			
		}
	}
	
	public double checarSaldo(Cuenta cuenta) {
		return cuenta.getSaldo();
	}
	
	
	
	

}
