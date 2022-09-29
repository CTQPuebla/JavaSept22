package com;

import java.util.Date;

public class Cajero {

	
	int Id, conteo =0;
	String ubicacion;

	
public Cajero() {
		
	}

	public Cajero(int id, String ubicacion) {
		Id = id;
		this.ubicacion = ubicacion;
	}
		
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getConteo() {
		return conteo;
	}

	public void setConteo(int conteo) {
		this.conteo = conteo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	@Override
	public String toString() {
		return "Cajero [Id=" + Id + ", conteo=" + conteo + ", ubicacion=" + ubicacion + "]";
	}

	public Ticket depositar(Cuenta cuenta, double monto) {
		Ticket t = null;
		
		//Valida que la cantidad por si sola no se pase del maximo
		if(cuenta.getMax()<monto) {
			System.out.println("Cantidad excede maximo permitido");
			return t;
		}else if((cuenta.getSaldo()+monto) > cuenta.getMax()) {
			System.out.println("Cantidad excederia el maximo permitido");
			return t;			
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			conteo++;
			return new Ticket(new Date(), cuenta.getSaldo()-monto, cuenta.getSaldo(), 
					monto, ubicacion, cuenta.getId(), conteo, Id);
		
		}
	}
	public Ticket retirar(Cuenta cuenta, double monto) {
		Ticket t = null;
		
		if(cuenta.getSaldo() < monto) {
			System.out.println("Sin fondos suficientes");
			return t;
		}else if((cuenta.getSaldo()-monto)<cuenta.getMin()){
			System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			return t;
		}else {
			cuenta.setSaldo(cuenta.getSaldo() -monto);
			conteo++;
			return new Ticket(new Date(), cuenta.getSaldo()-monto, cuenta.getSaldo(), 
					monto, ubicacion, cuenta.getId(), conteo, Id);
		}	
	}
	//Esta parte es para transferir
	public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {
		
		Ticket t = null;
		if(origen.getSaldo() < monto) {
			System.out.println("Sin fondos suficientes");
			return t;
		}else if((origen.getSaldo()-monto)<origen.getMin()){
			System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			return t;
		}else if(destino.getMax()<monto) {
			System.out.println("Cantidad excede maximo permitido");
			return t;
		}else if((destino.getSaldo()+monto) > destino.getMax()) {
			System.out.println("Cantidad excederia el maximo permitido");
			return t;			
		}else {
			//Transferencia
			
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(origen.getSaldo()+monto);
			conteo++;
			
			return new Ticket(new Date(), destino.getSaldo()-monto, destino.getSaldo(), 
					monto, ubicacion, destino.getId(), conteo, Id);
		}
	}
	
	public double checarSaldo(Cuenta cuenta) {
		return cuenta.getSaldo();
	}
	
}
