package modelo;

import java.io.Serializable; 

//Gestiona la logica general del juego

public class Juego implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Tablero tablero;
	private Jugador jugador;
	
	public Juego() {
		tablero = new Tablero();
	}
	
	public Tablero getTablero() {
		return tablero;
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public void setJugador (Jugador jugador) {
		this.jugador = jugador;
	}

}
