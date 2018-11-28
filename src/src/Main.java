package src;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Juego J=new Juego();
		J.empezar();
		J.ronda1();
		J.contar();
		J.mostrarPun();
		J.ronda2();
		J.contar();
		J.mostrarPun();
		J.Guardar();
	}

}
