package src;


public class Mano {
	private int nroCartas;
	private Carta Ca[]=new Carta[50];
	
	public Mano(int nroCartas, Carta[] ca) {
		this.nroCartas = nroCartas;
		Ca = ca;
	}
	public Mano()
	{
		nroCartas=0;
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
	public Carta agarrarcarta(int i){
		
		return Ca[i];
		
	}	
	
	public void repartir()
	{
		Mazo a=new Mazo();
		for(int i=1;i<11;i++)
		{
				
			Ca[i]=a.getCai(i);
			nroCartas++;
		}
		a.recorrer11();		
	}

}
