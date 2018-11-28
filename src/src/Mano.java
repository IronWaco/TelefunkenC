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
	public Carta getCai(int i) {
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
	public void sopar(Mesa me) {
        Scanner lee = new Scanner(System.in);
        int i;
        if(me.ver_sopar2()==true)
        {
            if(me.verificar_sopar()==true)
            {
               
                do{
                	 System.out.println("Ingrese la posicion de la carta que quiere sopar");
                     i=lee.nextInt();	
                }while(i<=0 && i>nroCartas);
                me.sopar(Ca[i]);
                for(int j=i+1; j<=nroCartas; j++)
                {
                    Ca[j-1]=Ca[j];
                }
                nroCartas=nroCartas-1;
            }
            else
            {
                System.out.println("No se puede sopar x2");
            }
        }
        else
        {
            System.out.println("No tiene la posibilidad de sopar ninguna carta");
        }
}
    
	public void mostrar() {
		for(int i = 1; i <= nroCartas; i++) {
			System.out.print(i + " : ");
			Ca[i].mostrar();
		}
	}
	public void tomarC(Mazo a)
	{
		nroCartas++;
		Ca[nroCartas]=a.getCai(1);
		a.tomarC();
		
	}
	public void eliminar(int n)
	{
		for(int i=n;i<nroCartas;i++)
			Ca[i]=Ca[i+1];
		nroCartas--;
	}
	public void quitar(Carta sa) {
		int x;
		for(int i = 1; i <= nroCartas; i++) {
			if(sa.getNombre().equals(Ca[i].getNombre()) && sa.getPalo().equals(Ca[i].getPalo())) {
				x = i;
				for(int j = x; j < nroCartas; j++) {
					Ca[j] = Ca[j+1];
				}nroCartas--; break;
			}
		}
	}
	public boolean verpalo(Carta c[],int e) {
		Boolean b = true;
		String s = c[1].getPalo();
		for(int i = 2; i <= e; i++) {
			if(!c[i].getPalo().equals(s) && !c[i].getPalo().equals("n.a.")) {
				b = false; break;
			}
		}
		return b;
	}
	
	public boolean verescalera(Carta v[],int e) {
		int g = v[1].getValor();  Boolean b = true;
		for(int i = 2; i <= e; i++) {
			if(v[i].getValor() != g+1) {
				System.out.println("error"); b = false;
				break;
			} else {
				g = v[i].getValor();
			}
		}
		return b;
	}

	public void ordenar(Carta v[],int e) {
		int g=0; Carta aux = new Carta();
		for (int i = 1; i <= e; i++) {
			for (int j = i+1; j <= e; j++) {
				if (v[i].getValor() > v[j].getValor()) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
	}
	public void añadir(Carta c){
		nroCartas++;
		Ca[nroCartas]=c;
		
	}	
		
}
