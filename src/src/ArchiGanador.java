package src;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ArchiGanador {
	private String nombre;
	public ArchiGanador(String nombre) {
	this.nombre = nombre;
}
public void listar() throws IOException {
	System.out.println("************** LISTAR **************");
	if ((new File(nombre)).exists()) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(nombre));
			while (true) {
				Jugador j = (Jugador)ois.readObject();
				j.mostrarp();
			}
		} catch (Exception e) {
			
		} finally {
			if (ois != null) {
				ois.close();
			}
		}
	}
	System.out.println("************ FIN LISTAR ************");
}
public void adicionar() throws IOException {
	Jugador jug = new Jugador();
	//jug.leer();
	
	ObjectOutputStream oos = null;
	try {
		if ((new File(nombre)).exists())
			oos = new AppendingObjectOutputStream(new FileOutputStream(nombre, true));
		else
			oos = new ObjectOutputStream(new FileOutputStream(nombre));
		
		oos.writeObject(jug);
	} catch (Exception e) {
		System.err.println("Error al adicionar:");
		System.out.println(e.getMessage());
	} finally {
		if (oos != null)
			oos.close();
	}
}
public void eliminar(String nick) throws IOException {
	if ((new File(nombre)).exists()) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null; 
		try {
			ois = new ObjectInputStream(new FileInputStream(nombre));
			oos = new ObjectOutputStream(new FileOutputStream("TEMP.txt"));
			while (true) {
				Jugador j = (Jugador)ois.readObject();
				if (j.getNombre().compareTo(nick) != 0)
					oos.writeObject(j);
			}
		} catch (Exception e) {
			
		} finally {
			if (ois != null)
				ois.close();
			if (oos != null)
				oos.close();
		}
		(new File(nombre)).delete();
		(new File("TEMP.txt")).renameTo(new File(nombre));
	}
}
public void ordenar() throws IOException {
	if ((new File(nombre)).exists()) {
		ObjectInputStream ois = null, ois2 = null;
		ObjectOutputStream oos = null; 
		try {
			ois = new ObjectInputStream(new FileInputStream(nombre));
			while (true) {
				Jugador j = (Jugador)ois.readObject();
				
				ois2 = null;
				oos = null;
				try {
					oos = new ObjectOutputStream(new FileOutputStream("TEMP.txt"));
					ois2 = new ObjectInputStream(new FileInputStream("ORDENADO.txt"));
					while (true) {
						Jugador k = (Jugador)ois2.readObject();
						if (j != null && k.getPuntuacion() < j.getPuntuacion()) {
							oos.writeObject(j);//Escribimos el objeto
							j = null;//Lo ponemos en null para no volver a agregarlo
						}
						oos.writeObject(k);
					}
				} catch (Exception e) {
					
				} finally {
					if (ois2 != null)
						ois2.close();
					if (oos != null) {
						//No se agrego el objeto "j" por que va al final de la lista
						//O la lista estaba vacia
						if (j != null)
							oos.writeObject(j);//La agregamos
						
						oos.close();
					}
				}
				if ((new File("ORDENADO.txt")).exists()) (new File("ORDENADO.txt")).delete();
				(new File("TEMP.txt")).renameTo(new File("ORDENADO.txt"));
			}
		} catch (Exception e) {
			
		} finally {
			if (ois != null)
				ois.close();
		}
		(new File(nombre)).delete();
		(new File("ORDENADO.txt")).renameTo(new File(nombre));
	}
}

}
