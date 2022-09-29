package com;

public class Pincipal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Moto t3 = new Moto();
  System.out.println(t3);
  
  
  t3.setAlto(1.65);
  t3.setCables(9);
  t3.setColor("verde");
  t3.setComponentes("bosinas,gomas,bateria");
  t3.setFrenos(2);
  t3.setLargo(1.90);
  t3.setLlantas(2);
  t3.setLuces(6);
  t3.setMarca("Italika");
  t3.setMateriales("metal,plastico");
  t3.setMotor(1);
  
  System.out.println(t3);
  
  Moto t4 = new Moto("negro", "fierro,goma", "faros,espejos,cadena","BMW", 1.75, 1.30, 3, 4, 1, 7, 2);
  System.out.println(t4);
  
  System.out.println(t4.getColor());
	}

}
