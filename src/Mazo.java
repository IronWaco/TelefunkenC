
public class Mazo {
	private int nroCartas;
	private Carta Ca[]=new Carta[109];
	public Mazo(int nroCartas, Carta[] ca) {
		this.nroCartas = nroCartas;
		Ca = ca;
	}
	public Mazo() {
		nroCartas = 1;
		Ca[1] = new Carta();
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
