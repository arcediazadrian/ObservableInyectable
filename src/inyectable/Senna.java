package inyectable;

public class Senna implements Piloto {
	 
	   private Vehiculo vehiculo;
	 
	   public Senna( Vehiculo v) {
	      vehiculo = v;
	   }
	 
	   public void setVehiculo(Vehiculo v) {
	      vehiculo = v;
	   }
	   @Override
	 
	   public void pilotar() {
	      vehiculo.conducir();
	   }
	}