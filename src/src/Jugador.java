package src;

import java.util.Scanner;

public class Jugador 
{
	private String nombre;
	private int puntuacion;
	private int compras;
	private int orden;
	private Mano m;
	boolean BR;
	
	public Jugador(String nombre, int puntuacion, int compras, int orden, Mano m)
	{
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.compras = compras;
		this.orden = orden;
		this.m = m;
		BR=false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getCompras() {
		return compras;
	}

	public void setCompras(int compras) {
		this.compras = compras;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public Mano getM() {
		return m;
	}

	public void setM(Mano m) {
		this.m = m;
	}
	
	public boolean isBR() {
		return BR;
	}

	public void setBR(boolean bR) {
		BR = bR;
	}

	public void repartir(Mazo a){
 		m.repartir(a);
 	}
	 public void sopar() {
         if(m.getNroCartas()<11)
         {
             m.sopar();
         }
     }

public void bajar(Mesa me){
		Scanner in = new Scanner(System.in);
		Boolean b = true; Carta v[] = new Carta[7]; int e = 0,z;
		m.mostrar();
		System.out.println("¿que cartas desea bajar?(elija numero)");
		System.out.println("ingrese 0 para terminar");
		for(int i = 1; i <= m.getNroCartas(); i++) {
			z = in.nextInt(); 
			if(z != 0) {
				e++;
				v[e] = m.getCai(z);
			} else {
				break;
			}
		}
		int g; Carta aux = new Carta();
		System.out.println("¿escalera?(si o no)");
		String y = in.next();
		if(y.equals("si")) {
	        for (int i = 1; i <= e; i++) {
	            for (int j = 1; j <= e - i; j++) {
	                if (v[j + 1].getValor() < v[j].getValor()) {
	                    aux = v[j + 1];
	                    v[j + 1] = v[j];
	                    v[j] = aux;
	                }
	            }
	        }
	        
	        g = v[1].getValor();
	        for(int i = 2; i <= e; i++) {
	        	if(v[i].getValor() != g+1 || !v[i].getPalo().equals(v[1].getPalo())) {
	        		System.out.println("error"); b = false;
	        		break;
	        	} else {
	        		 g = v[i].getValor();
	        	}
	        }
		} else {
			for(int i = 2; i <= e; i++) {
				if(v[i].getValor() != v[1].getValor()) {
					System.out.println("error"); b = false; break;
				}
			}
		}
		 if(b == true) {
	        	for(int i = 1; i <= e; i++) {
	        		me.agregar(v[i]);
	        		m.quitar(v[i]);
	        	}
	        }  
	}
	public void primera(Mesa me)
	{
		Scanner in = new Scanner(System.in);
		Boolean b = true; Carta v[] = new Carta[7]; int e = 0,z;
		m.mostrar();
		System.out.println("¿que cartas desea bajar?(elija numero)");
		System.out.println("ingrese 0 para terminar");
		for(int i = 1; i <= m.getNroCartas(); i++) {
			z = in.nextInt(); 
			if(z != 0) {
				e++;
				v[e] = m.getCai(z);
			} else {
				break;
			}
		}
		int g; Carta aux = new Carta();
		for(int i = 2; i <= e; i++) {
			if(v[i].getValor() != v[1].getValor()) {
				System.out.println("error"); b = false; break;
			}
		}
		if(b == true) {
	        	for(int i = 1; i <= e; i++) {
	        		me.agregar(v[i]);
	        		m.quitar(v[i]);
	        		BR=true;
	        	}
	        }	
	}
	 public void descartar(Mazo a)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("ingresar la carta a eliminar");
		 int n=sc.nextInt();
		 a.aumentar(m.getCai(n));
		 m.eliminar(n);
	 }
	 public void contar(){
		 while(m.getNroCartas()>0){
			 puntuacion=m.getCai(1).getValor()+ puntuacion;
			 m.eliminar(1);
			 
		 }
		 
	 }
	 

}
