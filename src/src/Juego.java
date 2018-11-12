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
            ju[i].sopar();
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
			ju[i]=new Jugador(nombre,0,7,i,new Mano());
			ju[i].repartir(Nuevo);
		}
	}
	public void ronda1()
	{
		
		Scanner sc=new Scanner(System.in);
		int orden=1,op, tu=0;
		while(ju[orden].getM().getNroCartas()>0)
		{
			System.out.println(ju[orden].getNombre());
			if(tu==0)
			{
				ju[orden].getM().tomarC(Nuevo);
				tu=tu+1;
			}
			ju[orden].getM().mostrar();
			System.out.println("que desea hacer");
			System.out.println("1.bajar");
			System.out.println("2.mortrar mesa");
			System.out.println("3.sopar");
			System.out.println("4.Terminar turno");
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
				ju[orden].sopar();
				break;
			case 4:
				ju[orden].descartar(Descarte);
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
