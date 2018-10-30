package src;
public class Juego {
	private int numJugadores;
	private Jugador ju[]=new  Jugador[10];
	private int ronda;
	
	public Juego(int numJugadores, Jugador[] ju, int ronda) {
		super();
		this.numJugadores = numJugadores;
		this.ju = ju;
		this.ronda = ronda;
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
 			ju[i].repartir();
 		}
	}
}
