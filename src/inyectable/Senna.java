package inyectable;

// Senna es dependiente de la interfaz Vehiculo que es implementada por la clase Ferrari y BMW
//Se puede inyectar dependencias mediante el uso de setters, lo que permite mayor flexibilidad. 
//Ya que incluso después de que un objeto de la clase haya sido creado, se podrá asignar un vehículo diferente.
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