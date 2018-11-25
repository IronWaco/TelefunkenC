package src;

import java.util.Scanner;

public class Mesa {
	 private int nroCartas, nroCartasx, nrofilas, pos;
	    private Carta Ca[][]=new Carta[50][50];
	    private Carta Cam[] = new Carta[50];
	    private Carta Caux[] = new Carta[50];

	    public Mesa(int nroCartas, Carta[][] ca) {
	            this.nroCartas = nroCartas;
	            Ca = ca;
	    }

	    public Mesa() {
	            nroCartas = 0;
	    }
	    //

	    public int getNroCartas() {
	            return nroCartas;
	    }
	    public void setNroCartas(int nroCartas) {
	            this.nroCartas = nroCartas;
	    }
	    public Carta[][] getCa() {
	            return Ca;
	    }
	    public void setCa(Carta[][] ca) {
	            Ca = ca;
	    }
		 
	    public void agregar(Carta c, int i, int e) {
	        nroCartas++;
	        Caux[nroCartas] = c;
	        int o, sw=0, swx=0;
	        if(i==e)
	        {
	            
	                if((!Caux[1].getPalo().equals(Caux[2].getPalo()) && !Caux[2].getPalo().equals(Caux[3].getPalo()) || 
	                        (Caux[1].getPalo().equals("n.a.") && !Caux[2].getPalo().equals(Caux[3].getPalo())) || 
	                        (!Caux[1].getPalo().equals(Caux[3].getPalo()) && Caux[2].getPalo().equals("n.a.")) ||
	                        (!Caux[1].getPalo().equals(Caux[2].getPalo()) && Caux[3].getPalo().equals("n.a."))) &&
	                        Caux[1]!=null && Caux[2]!=null && Caux[3]!=null)
	                {
	                    /*if(nrofilas==0)
	                    {
	                        for(int k=1; k<=nroCartas; k++)
	                        {
	                            Ca[1][k]=Caux[k];
	                        }
	                        nrofilas++;
	                        limpiar();
	                    }
	                    else
	                    {
	                        for(int j=1; j<=nrofilas; j++)
	                        {
	                            for(int k=1; k<=14; k++)
	                            {
	                                if(Ca[j][k]!=null)
	                                {
	                                    if(!Ca[j][k].getPalo().equals(Ca[j][k+1].getPalo()) && !Ca[j][k+1].getPalo().equals(Ca[j][k+2].getPalo()) || 
	                                            (Ca[j][k].getPalo().equals("n.a.") && !Ca[j][k+1].getPalo().equals(Ca[j][k+2].getPalo())) || 
	                                            (!Ca[j][k].getPalo().equals(Ca[j][k+2].getPalo()) && Ca[j][k+1].getPalo().equals("n.a.")) ||
	                                            (!Ca[j][k].getPalo().equals(Ca[j][k+1].getPalo()) && Ca[j][k+2].getPalo().equals("n.a.")))
	                                    {
	                                        int numeroaux=Ca[j][k].getNumero();
	                                        if(numeroaux==0)
	                                        {
	                                            numeroaux=Ca[j][k+1].getNumero();
	                                            if(numeroaux==0)
	                                            {
	                                                numeroaux=Ca[j][k+2].getNumero();
	                                            }
	                                        }
	                                        if(Caux[1].getNumero()==numeroaux)
	                                        {
	                                            swx=1;
	                                        }
	                                    }
	                                }
	                            }
	                            if(swx==1)
	                            {
	                                System.out.println("Tiene la posibilidad de sopar su tricka de ("+Caux[1].getNumero()+") en fila "+j+" de ");
	                            }
	                        }
	                        limpiar();
	                    }*/
	                    nrofilas++;
	                    for(int j=1; j<=e; j++)
	                    {
	                        Ca[nrofilas][j]=Caux[j];
	                    }
	                    limpiar();
	                    
	                }
	                else
	                {
	                    nrofilas++;
	                    for(int k=1; k<=e; k++)
	                    {
	                        o=Caux[k].getNumero();
	                        Ca[nrofilas][o]=Caux[k];
	                    }
	                    limpiar();
	                }
	        }
	    }
	    
	    private void limpiar() {
	        for(int i=1; i<=14; i++)
	        {
	            Caux[i]=null;
	        }
	        nroCartas=0;
	    }
	    
	    public void ordenarcam(Carta c) {
	        
	    }
	    
	    public void mostrar() {
	        for(int i = 1; i <= nrofilas; i++)
	        {
	            for(int j=1; j<=14; j++)
	            {
	                if(Ca[i][j]!=null)
	                {
	                    Ca[i][j].mostrar();
	                }
	            }
	            
	        }
	        System.out.println();
	    }
	    public void cartamagica(Mano x) {
	        nroCartasx=x.getNroCartas();
	        for(int i=1; i<=nroCartasx; i++)
	        {
	            Cam[i]=x.getCai(i);
	        }
	    }
	    
	    public void agregarm(Carta c) {
	        
	    }
	    
	    public Mesa(int a)
	        {
	            nroCartas=25;
	            Ca[1][1] = new Carta("as","espadas",11, 1);
	            Ca[1][2] = new Carta("2","espadas",2, 2);
	            Ca[1][3] = new Carta("3","espadas",3, 3);
	            Ca[1][4] = new Carta("4","espadas",4, 4);
	            Ca[1][5] = new Carta("5","espadas",5, 5);
	            Ca[1][6] = new Carta("6","espadas",6, 6);
	            Ca[1][7] = new Carta("7","espadas",7, 7);
	            Ca[1][8] = new Carta("8","espadas",8, 8);
	            Ca[1][9] = new Carta("9","espadas",9, 9);
	            Ca[1][10] = new Carta("10","espadas",10, 10);
	            Ca[1][11] = new Carta("Jack","espadas",11, 11);
	            Ca[1][12] = new Carta("Queen","espadas",11, 12);
	            Ca[1][13] = new Carta("king","espadas",11, 13);
	            Ca[2][1] = new Carta("7","trebol",7, 7);
	            Ca[2][2] = new Carta("8","trebol",8, 8);
	            Ca[2][3] = new Carta("9","trebol",9, 9);
	            Ca[2][4] = new Carta("10","trebol",10, 10);
	            Ca[2][5] = new Carta("Jack","trebol",11, 11);
	            Ca[2][6] = new Carta("Queen","trebol",11, 12);
	            Ca[2][7] = new Carta("joker","n.a.",11, 0);
	            Ca[3][1] = new Carta("5","corazon",5, 5);
	            Ca[3][2] = new Carta("6","corazon",6, 6);
	            Ca[3][3] = new Carta("7","corazon",7, 7);
	            Ca[4][1] = new Carta("joker","n.a.",8, 0);
	            Ca[4][2] = new Carta("8","trebol",8, 8);
	            Ca[4][3] = new Carta("8","espadas",8, 8);
	        }
	     //
	    public void llenar() {
	        nroCartasx=12;
	        Cam[1]= new Carta("as","trebol",11, 1);
	        Cam[2]= new Carta("8","espadas",11, 8);
	        Cam[3]= new Carta("7","trebol",11, 7);
	        Cam[4]= new Carta("8","corazon",11, 8);
	        Cam[5]= new Carta("as","espadas",11, 1);
	        Cam[6]= new Carta("Jack","espadas",11, 11);
	        Cam[7]= new Carta("10","espadas",11, 10);
	        Cam[8]= new Carta("king","trebol",11, 13);
	        Cam[9]= new Carta("5","espadas",11, 5);
	        Cam[10]= new Carta("6","espadas",11, 6);
	        Cam[11]= new Carta("9","espadas",11, 9);
	        Cam[12]= new Carta("joker","n.a.",11, 0);
	    } 
	    public void mostrarmano() {
	        for(int i = 1; i <= nroCartasx; i++)
	        {
	            Cam[i].mostrar();
	        }
	    }
	    
	    public boolean ver_sopar2() {
	        int sw=0, cc=0, ccc=1, ce=0, cce=0, swx=0, swy=0;
	        int nombrex, nombrey, nombrez, nombrea;
	        Carta cartaaux;
	        for(int j = 1; j <= nroCartasx; j++)
	        {
	            if(Cam[j].getNumero()==0)
	            {
	                System.out.println("Al tener un joker puede soparlo donde desee.");
	                sw=1;
	            }
	        }
	        for(int i=1; i<=nrofilas; i++)
	        {
	            swx=0; 
	            if(Ca[i][1]!=null && Ca[i][2]!=null && Ca[i][3]!=null && 
	                    (!Ca[i][1].getPalo().equals(Ca[i][2].getPalo()) && !Ca[i][2].getPalo().equals(Ca[i][3].getPalo()) || 
	                    (Ca[i][1].getPalo().equals("n.a.") && !Ca[i][2].getPalo().equals(Ca[i][3].getPalo())) || 
	                    (!Ca[i][1].getPalo().equals(Ca[i][3].getPalo()) && Ca[i][2].getPalo().equals("n.a.")) ||
	                    (!Ca[i][1].getPalo().equals(Ca[i][2].getPalo()) && Ca[i][3].getPalo().equals("n.a."))))
	            {
	                int numeroaux=Ca[i][1].getNumero();
	                if(numeroaux==0)
	                {
	                    numeroaux=Ca[i][2].getNumero();
	                    if(numeroaux==0)
	                    {
	                        numeroaux=Ca[i][3].getNumero();
	                    }
	                }
	                for(int j=1; j<=nroCartasx; j++)
	                {
	                    if(Cam[j].getNumero()==numeroaux)
	                    {
	                        sw=1;
	                        swx=1;
	                    }
	                }
	                if(swx==1)
	                {
	                    System.out.println("Tiene la posibilidad de sopar en la 'tricka' de "+numeroaux);
	                }
	            }
	            else
	            {
	                cc=0;
	                int ccx=1;
	                int l=1;
	                while(Ca[i][l]==null)
	                {
	                    ccx++;
	                    l++;
	                }
	                if(ccx!=1)
	                {
	                    ccx--;
	                }
	                if(Ca[i][1]!=null && Ca[i][1].getNumero()==0)
	                {
	                    Ca[i][1].setNombre("as");
	                    if(Ca[i][2].getNumero()!=0)
	                    {
	                        Ca[i][1].setPalo(Ca[i][2].getPalo());
	                    }
	                    else
	                    {
	                        Ca[i][3].setPalo(Ca[i][3].getPalo());
	                    }
	                    Ca[i][1].setValor(11);
	                    Ca[i][1].setNumero(1);
	                }
	                else
	                {
	                    if(Ca[i][11]!=null && Ca[i][11].getNumero()==0)
	                    {
	                        Ca[i][11].setNombre("Jack");
	                        if(Ca[i][12].getNumero()!=0)
	                        {
	                            Ca[i][11].setPalo(Ca[i][12].getPalo());
	                        }
	                        else
	                        {
	                            Ca[i][11].setPalo(Ca[i][13].getPalo());
	                        }
	                        Ca[i][11].setValor(11);
	                        Ca[i][11].setNumero(11);
	                    }
	                    else
	                    {
	                        if(Ca[i][12]!=null && Ca[i][12].getNumero()==0)
	                        {
	                            Ca[i][12].setNombre("Queen");
	                            if(Ca[i][13].getNumero()!=0)
	                            {
	                                Ca[i][12].setPalo(Ca[i][13].getPalo());
	                            }
	                            else
	                            {
	                                Ca[i][12].setPalo(Ca[i][11].getPalo());
	                            }
	                            Ca[i][12].setValor(11);
	                            Ca[i][12].setNumero(12);
	                        }
	                        else
	                        {
	                            if(Ca[i][13]!=null && Ca[i][13].getNumero()==0)
	                            {
	                                Ca[i][13].setNombre("king");
	                                if(Ca[i][12].getNumero()!=0)
	                                {
	                                    Ca[i][13].setPalo(Ca[i][12].getPalo());
	                                }
	                                else
	                                {
	                                    Ca[i][13].setPalo(Ca[i][11].getPalo());
	                                }
	                                Ca[i][11].setValor(11);
	                                Ca[i][11].setNumero(13);
	                            }
	                            else
	                            {
	                                for(int j=2; j<=10; j++)
	                                {
	                                    if(Ca[i][j]!=null)
	                                    {
	                                        if(Ca[i][j].getNumero()==0)
	                                        {
	                                            nombrex=(Integer.parseInt(Ca[i][j+1].getNombre()))-1;
	                                            String nombrexs=Integer.toString(nombrex);
	                                            Ca[i][j].setNombre(nombrexs);
	                                            Ca[i][j].setPalo(Ca[i][j+1].getPalo());
	                                            Ca[i][j].setValor(nombrex);
	                                            Ca[i][j].setNumero(nombrex);
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	                ccx++;
	                int m=ccx;
	                if(Ca[i][m].getPalo().equals(Ca[i][m+1].getPalo()))
	                {
	                    
	                    if(Ca[i][m].getNumero()==1 && Ca[i][m+1].getNumero()==2)
	                    {
	                        int k=1;
	                        while(Ca[i][k]!=null && k<=14)
	                        {
	                            cc++;
	                            if(cc==14)
	                            {
	                                System.out.println("Ah no amigo consigue la tuya");
	                                break;
	                            }
	                            k++;
	                        }
	                        String paloaux = Ca[i][cc].getPalo();
	                        int numeroaux = Ca[i][cc].getNumero()+1;
	                        if(numeroaux==14)
	                        {
	                            for(int j=1; j<=nroCartasx; j++)
	                            {
	                                if(Cam[j].getNumero()==1 && Cam[j].getPalo().equals(paloaux))
	                                {
	                                    sw=1;
	                                    swx=1;
	                                }
	                            }
	                            if(swx==1)
	                            {
	                                System.out.println("Tiene la posibilidad de sopar una carta en la escalera "+paloaux);
	                            }
	                        }
	                        else
	                        {
	                            for(int j=1; j<=nroCartasx; j++)
	                            {
	                                if(Cam[j].getNumero()==numeroaux && Cam[j].getPalo().equals(paloaux))
	                                {
	                                    sw=1;
	                                    swx=1;
	                                }
	                            }
	                            if(swx==1)
	                            {
	                                System.out.println("Tiene la posibilidad de sopar una carta en la escalera "+paloaux);
	                            }
	                        } 
	                    }
	                    else
	                    {
	                        int k=ccx;
	                        while(Ca[i][k]!=null && k<=14-ccx)
	                        {
	                            cc++;
	                            if(cc==14-ccx)
	                            {
	                                System.out.println("Ah no amigo consigue la tuya");
	                                break;
	                            }
	                            k++;
	                        }
	                        if(cc==14-ccx)
	                        {
	                            int numeroauxa=Ca[i][ccx].getNumero()-1;
	                            String paloaux=Ca[i][ccx].getPalo();
	                            for(int j=1; j<=nroCartasx; j++)
	                            {
	                                if(Cam[j].getNumero()==numeroauxa && Cam[j].getPalo().equals(paloaux))
	                                {
	                                    sw=1;
	                                    swx=1;
	                                }
	                            }
	                            if(swx==1)
	                            {
	                                System.out.println("Tiene la posibilidad de sopar una carta en la escalera "+paloaux);
	                            }
	                        }
	                        else
	                        {
	                            int numeroauxa=Ca[i][ccx].getNumero()-1;
	                            int numeroauxp=Ca[i][ccx+(cc-1)].getNumero()+1;
	                            String paloaux=Ca[i][ccx].getPalo();
	                            for(int j=1; j<=nroCartasx; j++)
	                            {
	                                if(Cam[j].getNumero()==numeroauxa && Cam[j].getPalo().equals(paloaux) || Cam[j].getNumero()==numeroauxp && Cam[j].getPalo().equals(paloaux))
	                                {
	                                    sw=1;
	                                    swx=1;
	                                }
	                            }
	                            if(swx==1)
	                            {
	                                System.out.println("Tiene la posibilidad de sopar una carta en la escalera "+paloaux);
	                            }
	                        }
	                    }
	                    
	                }
	            }
	        }
	        return sw==1;
	    }
	    
	     
	    public boolean verificar_sopar() {
	        Scanner lee = new Scanner(System.in);
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
	        int swx, sw=0, ce=0, cc=0, nombrex;
	        
	        for(int i=1; i<=nrofilas; i++)
	        {
	            int l=1;
	            int ccx=1;
	            if(x.getNumero()==0)
	            {
	                while(Ca[i][l]==null)
	                {
	                    ccx++;
	                    l++;
	                }
	                int p=ccx;
	                while(Ca[i][p]!=null)
	                {
	                    cc++;
	                }
	                Ca[i][ccx+cc]=x;
	            }
	            else
	            {
	                if(Ca[i][1]!=null && Ca[i][2]!=null && Ca[i][3]!=null && (!Ca[i][1].getPalo().equals(Ca[i][2].getPalo()) && !Ca[i][2].getPalo().equals(Ca[i][3].getPalo()) || 
	                        (Ca[i][1].getPalo().equals("n.a.") && !Ca[i][2].getPalo().equals(Ca[i][3].getPalo())) || 
	                        (!Ca[i][1].getPalo().equals(Ca[i][3].getPalo()) && Ca[i][2].getPalo().equals("n.a.")) ||
	                        (!Ca[i][1].getPalo().equals(Ca[i][2].getPalo()) && Ca[i][3].getPalo().equals("n.a."))))
	                {
	                    int numeroaux=Ca[i][1].getNumero();
	                    if(numeroaux==0)
	                    {
	                        numeroaux=Ca[i][2].getNumero();
	                        if(numeroaux==0)
	                        {
	                            numeroaux=Ca[i][3].getNumero();
	                        }
	                    }
	                    if(x.getNumero()==numeroaux || x.getNumero()==0)
	                    {
	                        int k=1;
	                        while(Ca[i][k]!=null)
	                        {
	                            ce++;
	                            k++;
	                        }
	                        ce++;
	                        Ca[i][ce]=x;
	                    }
	                }
	                else
	                {
	                    cc=0;
	                    while(Ca[i][l]==null)
	                    {
	                        ccx++;
	                        l++;
	                    }
	                    if(ccx!=1)
	                    {
	                        ccx--;
	                    }
	                    if(Ca[i][1]!=null && Ca[i][1].getNumero()==0)
	                    {
	                        Ca[i][1].setNombre("as");
	                        if(Ca[i][2].getNumero()!=0)
	                        {
	                            Ca[i][1].setPalo(Ca[i][2].getPalo());
	                        }
	                        else
	                        {
	                            Ca[i][3].setPalo(Ca[i][3].getPalo());
	                        }
	                        Ca[i][1].setValor(11);
	                        Ca[i][1].setNumero(1);
	                    }
	                    else
	                    {
	                        if(Ca[i][11]!=null && Ca[i][11].getNumero()==0)
	                        {
	                            Ca[i][11].setNombre("Jack");
	                            if(Ca[i][12].getNumero()!=0)
	                            {
	                                Ca[i][11].setPalo(Ca[i][12].getPalo());
	                            }
	                            else
	                            {
	                                Ca[i][11].setPalo(Ca[i][13].getPalo());
	                            }
	                            Ca[i][11].setValor(11);
	                            Ca[i][11].setNumero(11);
	                        }
	                        else
	                        {
	                            if(Ca[i][12]!=null && Ca[i][12].getNumero()==0)
	                            {
	                                Ca[i][12].setNombre("Queen");
	                                if(Ca[i][13].getNumero()!=0)
	                                {
	                                    Ca[i][12].setPalo(Ca[i][13].getPalo());
	                                }
	                                else
	                                {
	                                    Ca[i][12].setPalo(Ca[i][11].getPalo());
	                                }
	                                Ca[i][12].setValor(11);
	                                Ca[i][12].setNumero(12);
	                            }
	                            else
	                            {
	                                if(Ca[i][13]!=null && Ca[i][13].getNumero()==0)
	                                {
	                                    Ca[i][13].setNombre("king");
	                                    if(Ca[i][12].getNumero()!=0)
	                                    {
	                                        Ca[i][13].setPalo(Ca[i][12].getPalo());
	                                    }
	                                    else
	                                    {
	                                        Ca[i][13].setPalo(Ca[i][11].getPalo());
	                                    }
	                                    Ca[i][11].setValor(11);
	                                    Ca[i][11].setNumero(13);
	                                }
	                                else
	                                {
	                                    for(int j=2; j<=10; j++)
	                                    {
	                                        if(Ca[i][j]!=null)
	                                        {
	                                            if(Ca[i][j].getNumero()==0)
	                                            {
	                                                nombrex=(Integer.parseInt(Ca[i][j+1].getNombre()))-1;
	                                                String nombrexs=Integer.toString(nombrex);
	                                                Ca[i][j].setNombre(nombrexs);
	                                                Ca[i][j].setPalo(Ca[i][j+1].getPalo());
	                                                Ca[i][j].setValor(nombrex);
	                                                Ca[i][j].setNumero(nombrex);
	                                            }
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                    }
	                    ccx++;
	                    int m=ccx;
	                    if(Ca[i][m].getPalo().equals(Ca[i][m+1].getPalo()))
	                    {

	                        if(Ca[i][m].getNumero()==1 && Ca[i][m+1].getNumero()==2)
	                        {
	                            int k=1;
	                            while(Ca[i][k]!=null && k<=14)
	                            {
	                                cc++;
	                                if(cc==14)
	                                {
	                                    System.out.println("Ah no amigo consigue la tuya");
	                                    break;
	                                }
	                                k++;
	                            }
	                            String paloaux = Ca[i][cc].getPalo();
	                            int numeroaux = Ca[i][cc].getNumero()+1;
	                            if(numeroaux==14)
	                            {
	                                if(x.getNumero()==1 && x.getPalo().equals(paloaux))
	                                {
	                                    Ca[i][cc+1]=x;
	                                }
	                            }
	                            else
	                            {
	                                if(x.getNumero()==numeroaux && x.getPalo().equals(paloaux))
	                                {
	                                    Ca[i][cc+1]=x;
	                                }
	                            } 
	                        }
	                        else
	                        {
	                            int k=ccx;
	                            while(Ca[i][k]!=null && k<=14-ccx)
	                            {
	                                cc++;
	                                if(cc==14-ccx)
	                                {
	                                    System.out.println("Ah no amigo consigue la tuya");
	                                    break;
	                                }
	                                k++;
	                            }
	                            if(cc==14-ccx)
	                            {
	                                int numeroauxa=Ca[i][ccx].getNumero()-1;
	                                String paloaux=Ca[i][ccx].getPalo();
	                                if(x.getNumero()==numeroauxa && x.getPalo().equals(paloaux))
	                                {
	                                    Ca[i][ccx-1]=x;
	                                }
	                            }
	                            else
	                            {
	                                int numeroauxa=Ca[i][ccx].getNumero()-1;
	                                String paloaux=Ca[i][ccx].getPalo();
	                                if(x.getNumero()==numeroauxa && x.getPalo().equals(paloaux))          
	                                {
	                                    Ca[i][ccx-1]=x;
	                                }
	                                else
	                                {
	                                    int numeroauxp=Ca[i][ccx+(cc-1)].getNumero()+1;
	                                    if(x.getNumero()==numeroauxp && x.getPalo().equals(paloaux) )
	                                    {
	                                        Ca[i][ccx+cc]=x;
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	            
	        }
	  }
	   
	    
}
