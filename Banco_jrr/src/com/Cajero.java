package com;

import java.util.Date;

public class Cajero {
	String id, ubicacion;
	int conteo = 0;

	public Cajero() {

	}

	/**
	 * 
	 * @param id ID de cajero
	 * @param ubicacion Ubicación del cajero
	 */
	public Cajero(String id, String ubicacion) {
		this.id = id;
		this.ubicacion = ubicacion;
		//conteo = 0;
	}
	
	public Cajero(String id, String ubicacion, int conteo) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.conteo = conteo;
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

	/********** MÉTODOS (COMPORTAMIENTO) **********/

	public Ticket depositar(Cuenta cuenta, double monto) {
		Ticket t = null;
		// Valida que la cantidad por si sola no se pase del máximo
		if (cuenta.getMax() < monto) {
			System.out.println("Cantidad excede máximo permitido");
			return t;
		} else if ((cuenta.getSaldo() + monto) > cuenta.getMax()) {
			System.out.println("Deposito excederia el máximo permitido");
			return t;
		} else {
			cuenta.setSaldo(cuenta.getSaldo() + monto);
			conteo++;
			return new Ticket(new Date(), cuenta.getSaldo() - monto, cuenta.getSaldo(), monto, cuenta.getId(),
					ubicacion, conteo, Integer.parseInt(id));
		}
	}

	public Ticket retirar(Cuenta cuenta, double monto) {
		// Ticket t = null;
		//Que tenga suficiente dinero
		if (cuenta.getSaldo() < monto) {
			System.out.println("Sin fondos suficientes");
			return null;
		} else if ((cuenta.getSaldo() - monto) < cuenta.getMin()) {
			System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			return null;
		}// else {
			cuenta.setSaldo(cuenta.getSaldo() - monto);
			conteo++;
			return new Ticket(
						new Date(),
						cuenta.getSaldo() + monto,
						cuenta.getSaldo(),
						monto,
						cuenta.getId(),
						ubicacion,
						conteo,
						Integer.parseInt(id)
					);
		//}

	}

	public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {
		if (origen.getSaldo() < monto) {
			System.out.println("Sin fondos suficientes");
			return null;
		} else if ((origen.getSaldo() - monto) < origen.getMin()) {
			System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			return null;
		}else if (destino.getMax() < monto) {
			System.out.println("Cantidad excede máximo permitido del destinatario");
			return null;
		} else if ((destino.getSaldo() + monto) > destino.getMax()) {
			System.out.println("Deposito excederia el máximo permitido del destinatario");
			return null;
		}else {	
			//Transferencia
			origen.setSaldo(origen.getSaldo() - monto);
			destino.setSaldo(destino.getSaldo() + monto);
			conteo++;
			return new Ticket(
					new Date(),
					destino.getSaldo() - monto,
					destino.getSaldo(),
					monto,
					destino.getId(),
					ubicacion,
					conteo,
					Integer.parseInt(id)
				);
		}
	}
	
	public double checarSaldo(Cuenta cuenta) {
		return cuenta.getSaldo();
	}

}
