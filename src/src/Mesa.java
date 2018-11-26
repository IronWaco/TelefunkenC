package src;

import java.util.Scanner;

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
	 public boolean ver_sopar() {
         int nroCartasx, nombrex, nombrey, nombrez;
         nroCartasx=nroCartas/3;
         for(int j=0; j<=nroCartasx; j=j+3)
         {
             if(Ca[j].getNombre()==Ca[j+1].getNombre() && Ca[j+1].getNombre()==Ca[j+2].getNombre())
             {
                 return true;
             }
             else
             {
                 if(Ca[j].getNombre().equals("as") && Ca[j+1].getNombre().equals("2") && Ca[j+2].getNombre().equals("3") || Ca[j].getNombre().equals("Jack") && Ca[j+1].getNombre().equals("Queen") && Ca[j+2].getNombre().equals("king"))
                 {
                     return true;
                 }
                 else
                 {
                     nombrex=Integer.parseInt(Ca[j].getNombre());
                     nombrey=Integer.parseInt(Ca[j+1].getNombre());
                     nombrez=Integer.parseInt(Ca[j+2].getNombre());
                     if(nombrex<nombrey && nombrey<nombrez)
                     {
                         return true;
                     }
                     else
                     {
                         return false;
                     }
                 } 
             }
         }
         return false;
     }
     
     public boolean verificar_sopar() {
         Scanner lee = new Scanner(System.in);
         System.out.println("Tiene la posibilidad de sopar sus cartas");
         System.out.println("Quiere sopar alguna carta?");
         System.out.println("Escriba 'si' para sopar o 'no' para seguir jugando");
         String a=lee.next();
         if(a.equals("si"))
         {
             return true;
         }
         else
         {
             return false;
         }
     }
     
     public void sopar(Carta x) {
         nroCartas=nroCartas+1;
         Ca[nroCartas]=x;
     }
     public void agregar(Carta c) {
 		nroCartas++;
 		Ca[nroCartas] = c;
 	}
     public void mostrar() {
 		for(int i = 1; i <= nroCartas; i++) {
 			Ca[i].mostrar();
 		}
 	}
     //Rossie3
     public void tomarCarta(){
    		for(int i=1;i<nroCartas;i++)
	 			Ca[i]=Ca[i+1];
	 		nroCartas--;
    	 nroCartas--;
    	 
     }
}
