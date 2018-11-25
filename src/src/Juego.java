package src;

import java.util.Scanner;

public class Juego {
	private int numJugadores;
	private Jugador ju[]=new  Jugador[10];
	private int ronda;
	Mazo Nuevo=new Mazo();
	Mazo Descarte=new Mazo(0);
	Mesa Me=new Mesa();
	
	public Juego(int numJugadores, Jugador[] ju, int ronda) {
		this.numJugadores = numJugadores;
		this.ju = ju;
		this.ronda = ronda;
	}

	public Juego() {
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public Jugador[] getJu() {
		return ju;
	}

	public void setJu(Jugador[] ju) {
		this.ju = ju;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	
	public void repartir(){
 		for(int i=0;i<numJugadores;i++){
 			ju[i].repartir(Nuevo);
 		}
	}
	public void sopar() {
        for(int i=0; i<numJugadores; i++)
        {
            ju[i].sopar(Me);
        }
    }
	public void empezar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("numero de jugadores:");
		numJugadores=sc.nextInt();
		String nombre;
		Nuevo=Nuevo.desordenar();
		for(int i=1;i<=numJugadores;i++)
		{
			System.out.print("nombre Jugador:");
			nombre=sc.next();
			ju[i]=new Jugador(nombre,0,0,i,new Mano());
			ju[i].repartir(Nuevo);
		}
		Descarte.aumentar(Nuevo.getCai(1));
		Nuevo.tomarC();
	}
	public void ronda1()
	{
		
		Scanner sc=new Scanner(System.in);
		int orden=1,op, tu=0,co;
		while(ju[orden].getM().getNroCartas()>0)
		{
			System.out.println(ju[orden].getNombre());
			if(tu==0)
			{
				ju[orden].getM().tomarC(Nuevo);
				tu=tu+1;
			}
			ju[orden].ordenar();
			ju[orden].getM().mostrar();
			if(ju[orden].isBR())
			{
				System.out.println("que desea hacer");
				System.out.println("1.bajar");
				System.out.println("2.mortrar mesa");
				System.out.println("3.sopar");
				System.out.println("4.Terminar turno");
				op=sc.nextInt();
				switch(op)
				{
				case 1:
					ju[orden].bajar(Me);;
					break;
				case 2:
					Me.mostrar();
					break;
				case 3:
					ju[orden].sopar(Me);
					break;
				case 4:
					tu=0;
					ju[orden].descartar(Descarte);
					Descarte.getCai(1).mostrar();;
					System.out.print("Algun jugador comprara la carta?:");
					System.out.println("0.Ninguno");
					for(int i=1;i<=numJugadores;i++)
						System.out.println(i+"."+ju[i].getNombre());
					co=sc.nextInt();
					if(co!=0)
					{
						if(ju[co].getCompras()!=7){
							ju[co].setCompras(ju[co].getCompras()+1);
							ju[co].agregar(Descarte.sacar());
							ju[co].agregar(Nuevo.tomarCarta());
						}
						 else{
							 System.out.println("Excedio el número de compras");				 
						 }
					}
					orden =orden+1;
					if(orden>numJugadores)
					{
						orden=1;
					}
					break;
				}
			}
			else
			{
				System.out.println("debe bajar una trica limpia");
				System.out.println("1.bajar");
				System.out.println("2.mortrar mesa");
				System.out.println("3.Terminar turno");
				op=sc.nextInt();
				switch(op)
				{
				case 1:
					ju[orden].primera(Me);
					break;
				case 2:
					Me.mostrar();
					break;
				case 3:
					tu=0;
					ju[orden].descartar(Descarte);
					Descarte.getCai(1).mostrar();;
					System.out.println("Algun jugador comprara la carta?:");
					System.out.println("0.Ninguno");
					for(int i=1;i<=numJugadores;i++)
						System.out.println(i+"."+ju[i].getNombre());
					co=sc.nextInt();
					if(co!=0)
					{
						if(ju[co].getCompras()!=7){
							ju[co].setCompras(ju[co].getCompras()+1);
							ju[co].agregar(Descarte.sacar());
							ju[co].agregar(Nuevo.tomarCarta());
						}
						 else{
							 System.out.println("Excedio el número de compras");				 
						 }
					}
					orden =orden+1;
					if(orden>numJugadores)
					{
						orden=1;
					}
					break;
				}
			}
			
		}
	}
	public void ronda2()
	{

		Scanner sc=new Scanner(System.in);
		int orden=1,op, tu=0,co;
		while(ju[orden].getM().getNroCartas()>0)
		{
			System.out.println(ju[orden].getNombre());
			if(tu==0)
			{
				ju[orden].getM().tomarC(Nuevo);
				tu=tu+1;
			}
			ju[orden].getM().mostrar();
			if(ju[orden].isBR())
			{
				System.out.println("que desea hacer");
				System.out.println("1.bajar");
				System.out.println("2.mortrar mesa");
				System.out.println("3.sopar");
				System.out.println("4.Terminar turno");
				op=sc.nextInt();
				switch(op)
				{
				case 1:
					ju[orden].bajar(Me);;
					break;
				case 2:
					Me.mostrar();
					break;
				case 3:
					ju[orden].sopar(Me);
					break;
				case 4:
					tu=0;
					ju[orden].descartar(Descarte);
					Descarte.getCai(1).mostrar();;
					System.out.print("Algun jugador comprara la carta?:");
					System.out.println("0.Ninguno");
					for(int i=1;i<=numJugadores;i++)
						System.out.println("1."+ju[i].getNombre());
					co=sc.nextInt();
					if(co!=0)
					{
						if(ju[orden].getCompras()!=7){
							ju[co].setCompras(ju[co].getCompras()+1);
							ju[co].agregar(Descarte.sacar());
							ju[co].agregar(Nuevo.tomarCarta());
						}
						 else{
							 System.out.println("Excedio el número de compras");				 
						 }
					}
					orden =orden+1;
					if(orden>numJugadores)
					{
						orden=1;
					}
					break;
				}
			}
			else
			{
				System.out.println("debe bajar dos tricas");
				System.out.println("1.bajar");
				System.out.println("2.mortrar mesa");
				System.out.println("3.Terminar turno");
				op=sc.nextInt();
				switch(op)
				{
				case 1:
					ju[orden].bajar(Me);
					break;
				case 2:
					Me.mostrar();
					break;
				case 3:
					tu=0;
					ju[orden].descartar(Descarte);
					Descarte.getCai(1).mostrar();;
					System.out.print("Algun jugador comprara la carta?:");
					System.out.println("0.Ninguno");
					for(int i=1;i<=numJugadores;i++)
						System.out.println(i+"."+ju[i].getNombre());
					co=sc.nextInt();
					if(co!=0)
					{
						if(ju[orden].getCompras()!=7){
							ju[co].setCompras(ju[co].getCompras()+1);
							ju[co].agregar(Descarte.sacar());
							ju[co].agregar(Nuevo.tomarCarta());
						}
						 else{
							 System.out.println("Excedio el número de compras");				 
						 }
					}
					orden =orden+1;
					if(orden>numJugadores)
					{
						orden=1;
					}
					break;
				}
			}
			
		}
	}
	public void contar()
	{
		for(int i=1;i<=numJugadores;i++)
		{
			ju[i].contar();
		}
	}
}
