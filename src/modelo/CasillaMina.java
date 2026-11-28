package modelo;

/**
 * Representa una casilla que contiene una mina.
 */
public class CasillaMina extends Casilla {
	
	@Override
	public String mostrarContenido() {
		return "X";
	}

}
