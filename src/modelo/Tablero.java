package modelo;

import java.io.Serializable; 

// Representa el tablero principal del juego

public class Tablero implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Casilla [][] casillas;
	public Tablero () {
		casillas = new Casilla [10][10];
	}

	public Casilla[][] getCasilla() {
		return casillas;
	}
	
	public void serCasillas(Casilla[][] casillas) {
		this.casillas = casillas;
	}
	
	
}
