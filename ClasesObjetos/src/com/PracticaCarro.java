package com;

public class PracticaCarro {
	public static void main(String[] args) {
		
	
	// crear el objeto
	
	Carro c1 =new Carro();
	System.out.println(c1);
	
c1.setMarca("Nissan");
c1.setColor("Rojo");
c1.setModelo("Sentra");
c1.setAño(2002);
c1.setPuertas(4);
c1.setMotor(1.8f);
System.out.println(c1);

Carro c2 = new Carro(" Nissan", "Sentra","Rojo","Carroceria,Asientos,Volante",4,4,2002,1.8f,4);
System.out.println(c2);
System.out.println(c2.getComponentes());
	
	}

}
