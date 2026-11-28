package modelo;

import java.io.Serializable;
import interfaces.Descubrible;

/** Clase abstracta que representa una casilla del tablero **/

public abstract class Casilla implements Descubrible, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private boolean descubierta; 
	private boolean marcada; 
	
	public Casilla() {
		this.descubierta = false;
		this.marcada = false;
	}

	public boolean isDescubierta() {
		return descubierta;
	}
	
	public void setDescubierta (boolean descubierta) {
		this.descubierta = descubierta;
	}
	
	public boolean isMarcada() {
		return marcada;
	}
	
	public void setMarcada (boolean marcada) {
		this.marcada = marcada;	
	}
	
	@Override
	public void descubrir() {
		this.descubierta = true;
	}
	
	public abstract String mostrarContenido();
	
	}
 