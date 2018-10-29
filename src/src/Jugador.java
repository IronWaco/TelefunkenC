package src;


public class Jugador 
{
	private String nombre;
	private int puntuacion;
	private int compras;
	private int orden;
	private Mano m=new Mano();
	
	public Jugador(String nombre, int puntuacion, int compras, int orden, Mano m)
	{
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.compras = compras;
		this.orden = orden;
		this.m = m;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getCompras() {
		return compras;
	}

	public void setCompras(int compras) {
		this.compras = compras;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public Mano getM() {
		return m;
	}

	public void setM(Mano m) {
		this.m = m;
	}
	
	

}
