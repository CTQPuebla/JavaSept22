package com;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tijeras t1 = new Tijeras();
System.out.println(t1);


t1.setMaterial("metal");
t1.setPartes(2);
t1.setTamaño(2.5);
t1.setTornillos(1);

System.out.println(t1);

Tijeras t2 = new Tijeras("Metal", 2, 1, 2.6);

Pinsas t3 = new Pinsas();
System.out.println(t3);

t3.setColor("Azul");
t3.setMaterial("Hierro");
t3.setPiesas("dos");
t3.setTaquete(1);

System.out.println(t3);
   
Pinsas t4 = new Pinsas("Hierro", "dos", "Morado", 2);


Nabaja t5 = new Nabaja();
System.out.println(t4);

t5.setAncho(1.5);
t5.setColor("verde");
t5.setLargo(3.4);
t5.setMaterial("Acero");
t5.setPiesas(1);
System.out.println(t5);

Nabaja t6 = new Nabaja("Fierro", 1, "Plateado", 2.8, 1.7);



Desarmador t7 = new Desarmador();
System.out.println(t7);

t7.setColor("rojo");
t7.setForma("Cruz");
t7.setMaterial("Metal");
t7.setPiesas(1);
System.out.println(t7);
Desarmador t8 = new Desarmador("metal", "Cafe", 1, "Plano");
	}
	
	

}
