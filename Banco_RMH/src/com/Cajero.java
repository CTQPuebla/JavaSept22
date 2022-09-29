package com;

import java.util.Date;

public class Cajero{
	
	int conteo=0;
	String ubicacion,id;
	
	public Cajero() {
		
	}
	
	public Cajero( String ubicacion, String id) {
		super();
		this.ubicacion = ubicacion;
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cajero [conteo=" + conteo + ", ubicacion=" + ubicacion + ", id=" + id + "]";
	}

	//<......METODOS.............>
	//(argumentos)
	public Ticket depositar(Cuenta cuenta, double monto) {
		
		//Como devuelve un objeto ticket tiene que retornar algo por si hay error
		Ticket t = null;
		
		//Valida que la cantidad por si sola no pase el max
		if(cuenta.getMax()<monto) {
			
			System.out.println("Cantidad excede maximo permitido");
			return t;
		}
		//Valida que el monto + saldo act no exceda max
		else if( (cuenta.getSaldo()+monto) > cuenta.getMax() ){
			System.out.println("El deposito excede el maximo permitido");
			return t;
		}
		else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			conteo++;//Es el folio
			
			//Ticket + (ctrl+ espacio)
			return new Ticket(new Date(), 
					cuenta.getSaldo()-monto, 
					cuenta.getSaldo(), 
					monto, cuenta.getId(), Integer.toString(conteo), 
					id, ubicacion);
		}
		
	}
	//cambias void x ticket porque es lo que vas a retornar
	public Ticket retirar(Cuenta cuenta, double monto) {
		Ticket t = null;
		
		if(monto>cuenta.getSaldo()) {
			System.out.println("Fondos insuficientes");
			return t;
		}
		else if( (cuenta.getSaldo()-monto)<cuenta.getMin()) {
			System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			return t;
		}
		else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			conteo++;
			return new Ticket(new Date(), 
/*Saldo Anterior*/	cuenta.getSaldo()+monto, 
					cuenta.getSaldo(), 
					monto, cuenta.getId(), Integer.toString(conteo), 
					id, ubicacion);
		}
		
	}

	public Ticket transferir(Cuenta corigen, Cuenta cdestino, double monto) {
		
		Ticket t = null;
		
		if(monto>corigen.getSaldo()) {
			System.out.println("Fondos insuficientes");
			return t;
		}
		else if( (corigen.getSaldo()-monto)<corigen.getMin()) {
			System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			return t;
		}
		else if(cdestino.getMax()<monto) {
			
			System.out.println("Cantidad excede maximo permitido");
			return t;
		}
		//Valida que el monto + saldo act no exceda max
		else if( (cdestino.getSaldo()+monto) > cdestino.getMax() ){
			System.out.println("El deposito excede el maximo permitido");
			return t;
		}
		else {
			//Transferencia
			corigen.setSaldo(corigen.getSaldo()-monto);
			cdestino.setSaldo(cdestino.getSaldo()+monto);
			conteo ++;
			
			return new Ticket(new Date(), 
/*Saldo Anterior*/	cdestino.getSaldo()-monto, 
					cdestino.getSaldo(), 
					monto, cdestino.getId(), Integer.toString(conteo), 
					id, ubicacion);
			
		}
		
	}
	
	public double checarSaldo(Cuenta cuenta) {
		return cuenta.getSaldo();
	}
	
	

}


