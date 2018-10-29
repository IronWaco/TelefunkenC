package src;


public class Mesa {
	private int nroCartas;
	private Carta Ca[]=new Carta[50];
	
	public Mesa(int nroCartas, Carta[] ca) {
		this.nroCartas = nroCartas;
		Ca = ca;
	}
	public Mesa() {
		nroCartas = 0;
	}
	public int getNroCartas() {
		return nroCartas;
	}
	public void setNroCartas(int nroCartas) {
		this.nroCartas = nroCartas;
	}
	public Carta[] getCa() {
		return Ca;
	}
	public void setCa(Carta[] ca) {
		Ca = ca;
	}
}
