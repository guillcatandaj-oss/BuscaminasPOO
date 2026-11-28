package modelo;

//Representa una casilla sin mina

public class CasillaNormal extends Casilla {
	private int minasAlrededor;
	public CasillaNormal() {
		this.minasAlrededor = 0;
	}

	public int getMinasAlrededor() {
		return minasAlrededor;
	}
	
	public void setMinasAlrededor (int minasAlrededor) {
		this.minasAlrededor = minasAlrededor;
	}
	
	@Override
	public String mostrarContenido() {
		return String.valueOf(minasAlrededor);
	}
}
