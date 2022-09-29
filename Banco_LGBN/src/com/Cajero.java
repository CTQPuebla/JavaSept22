package com;

import java.util.Date;

public class Cajero {
	String id, ubicacion;
	int conteo;
	
	
	public Cajero() {
		
	}


	public Cajero(String id, String ubicacion) {
		super();
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
		return "Cajero [id=" + id + ", ubicacion=" + ubicacion +"]";
	}
	
	public Ticket depositar(Cuenta cuenta, double monto) {
		Ticket t = null;
			//cantidad sola no pase el maximo
		if(cuenta.getMax()<monto) {
			System.out.println("Cantidad excede máximo permitido");
			return t;
			//saldo actual mas monto sobrepasa el maximo
		}else if((cuenta.getSaldo()+monto)>cuenta.getMax()){
			System.out.println("Deposito excede el máximo permitido");
			return t;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			conteo++;
			System.out.println("Saldo actual afectado con éxito");
			return new Ticket(new Date(), cuenta.getSaldo()-monto, cuenta.getSaldo(),
					monto, cuenta.getId(), ubicacion, conteo, Integer.parseInt(id));
		}
				
	}
	public Ticket retirar(Cuenta cuenta, double monto) {
		Ticket r = null;
			if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente");
				return r;
			}else if((cuenta.getSaldo()-monto)<cuenta.getMin()) {
				System.out.println("Saldo insuficiente, saldo por debajo del minimo");
				return r;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				conteo++;
				System.out.println("Saldo afectado con éxito");
				return new Ticket(new Date(), cuenta.getSaldo()+monto, cuenta.getSaldo(),
						monto, cuenta.getId(), ubicacion, conteo, Integer.parseInt(id));
			}	
	}
	
	
	public Ticket trasferir(Cuenta origen,Cuenta destino, double monto) {
		Ticket tr = null;
		if (destino.getSaldo()<monto) {
			System.out.println("Saldo insuficiente");
			return tr;
		}else if((destino.getSaldo()-monto)<destino.getMin()) {
			System.out.println("Saldo insuficiente, saldo por debajo del minimo");
			return tr;
			}
		if(origen.getMax()<monto) {
			System.out.println("Cantidad excede máximo permitido");
			return tr;
		}else if((origen.getSaldo()+monto)>origen.getMax()){
			System.out.println("Deposito excede el máximo permitido");
			return tr;
	
		}else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			conteo++;
			return new Ticket(new Date(),
					destino.getSaldo()+monto,
					destino.getSaldo(),
					monto,
					destino.getId(),
					ubicacion,conteo,
					Integer.parseInt(id));
		
		
		}
	}
//	IMPRIMIR UN APARTADO EN ESPECIFICO
	public double checarSaldo(Cuenta cuenta) {
		return cuenta.getSaldo();
	}
}