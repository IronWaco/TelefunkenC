package src;

import java.util.Scanner;

public class Mano {
	private int nroCartas;
	private Carta Ca[]=new Carta[50];
	private Mesa Me = new Mesa();
	
	public Mano(int nroCartas, Carta[] ca) {
		this.nroCartas = nroCartas;
		Ca = ca;
	}
	public Mano()
	{
		nroCartas=0;
		for(int i=0;i<50;i++)
			Ca[i]=new Carta();
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
	
	public void repartir(Mazo a)
	{
		for(int i=1;i<=11;i++)
		{
			Ca[i]=a.getCai(i);
			nroCartas++;
		}
		a.recorrer11();		
	}
	public void sopar() {
        Scanner lee = new Scanner(System.in);
        int i;
        if(Me.ver_sopar()==true)
        {
            if(Me.verificar_sopar()==true)
            {
                System.out.println("Ingrese la posicion de la carta que quiere sopar");
                i=lee.nextInt();
                Me.sopar(Ca[i]);
                for(int j=i+1; j<=nroCartas; j++)
                {
                    Ca[j-1]=Ca[j];
                }
                nroCartas=nroCartas-1;
            }
        }
	}
	public void mostrar()
	{
		for(int i=1;i<=nroCartas;i++)
		{
			Ca[i].mostrar();
		}
	}
}
