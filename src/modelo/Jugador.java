package modelo;

import java.io.Serializable; 

//Representa al jugador

public class Jugador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	public Jugador (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
