package com;

import java.util.Date;

public class Cajero {

	String id, ubicacion;
	int conteo = 0;
	
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

	public int getConteo() {
		return conteo;
	}

	public void setConteo(int conteo) {
		this.conteo = conteo;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", ubicacion=" + ubicacion + ", conteo=" + conteo + "]";
	}
	public Ticket depositar(Cuenta cuenta, double monto) {
		Ticket t = null;
		
		//valida que la cantidad no pase del maximo
		if(cuenta.getMax()<monto) {
			System.out.println("Cantidad excede el maximo permitido");
			return t;
		}else if((cuenta.getSaldo()+monto)>cuenta.getMax()){
			System.out.println("Deposito excede el maximo permitido");
			return t;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			conteo++;
			return new Ticket(new Date(), cuenta.getSaldo()-monto,
					cuenta.getSaldo(), monto, cuenta.getId(), ubicacion,
					conteo, Integer.parseInt(id));
			//System.out.println("Tu saldo actual es: ");;
		}
	}
    public Ticket retirar(Cuenta cuenta, double monto) {
    	Ticket t = null;
    	if(cuenta.getSaldo()<monto){
    		System.out.println("sin fondos susficientes");
    		return t;
    	}else if((cuenta.getSaldo()-monto)<cuenta.getMin()){
    		System.out.println("El retiro dejaria por debajo del minimo la cuenta");
    		return t;
    	}else {
    		cuenta.setSaldo(cuenta.getSaldo()- monto);
    		conteo++;
    		return new Ticket(new Date(),
    				cuenta.getSaldo()+monto,
					cuenta.getSaldo(), monto, 
					cuenta.getId(), ubicacion,
					conteo, Integer.parseInt(id));
    	}
    	
	
	}
    public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {
	      
    	Ticket t = null;
    	
    	if(origen.getSaldo()<monto){
    		System.out.println("sin fondos susficientes");
    		return t;
    	}else if((origen.getSaldo()-monto)<origen.getMin()){
    		System.out.println("El retiro dejaria por debajo del minimo la cuenta");
    		return t;
    	}else if(destino.getMax()<monto) {
			System.out.println("Cantidad excede el maximo permitido");
			return t;
		}else if((destino.getSaldo()+monto)>destino.getMax()){
			System.out.println("Deposito excede el maximo permitido");
			return t;
		}else {
			//transferencia
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			conteo++;
			
			return new Ticket(new Date(), 
					destino.getSaldo()-monto,
					destino.getSaldo(), monto, 
					destino.getId(), ubicacion,
					conteo, Integer.parseInt(id));
		}
    
    	
}
    public double checarSaldo(Cuenta cuenta) {
    	return cuenta.getSaldo();
    }
	
}
