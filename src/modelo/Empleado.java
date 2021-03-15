package modelo;

import java.util.ArrayList;

public class Empleado {
	private String nombre;
	private ArrayList<String> horasTrabajo;
	
	public Empleado() {
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getHorasTrabajo() {
		return horasTrabajo;
	}
	public void setHorasTrabajo(ArrayList<String> horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	} 
}
