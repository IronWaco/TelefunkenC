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

		public boolean isBR() {
			return BR;
		}

		public void setBR(boolean bR) {
			BR = bR;
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
		public void repartir(Mazo a){
	 		m.repartir(a);
	 	}
		 public void sopar(Mesa me) {
	         if(m.getNroCartas()<11)
	         {
	             me.cartamagica(m);
	             m.sopar(me);
	             
	         }
	     }
		public void bajar(Mesa me){
			Scanner in = new Scanner(System.in);
			Boolean b = true, esc = true; Carta v[] = new Carta[7]; int e = 0,z,w = 0;;
			m.mostrar();
			System.out.println("¿que cartas desea bajar?(elija numero)");
			System.out.println("ingrese 0 para terminar");
			for(int i = 1; i <= m.getNroCartas(); i++) {
				//recibe cartas
				z = in.nextInt(); 
				if(z != 0) {
					e++;
					v[e] = m.getCai(z);
					if(v[e].getNombre().equals("Joker")) {
						w++;
					}
				} else {
					break;
				}
			} 
			if(e > 2) { 
				int g = 0;
				m.ordenar(v, e);
				if(v[1].getValor() != v[2].getValor() && v[1].getValor() != v[3].getValor() && v[2].getValor() != v[3].getValor()) {
					//escalera
					esc = m.verpalo(v, e);
					g = v[1].getValor(); int sp = 0, sp1 =0,j1 = 0, j2 = 0; Boolean br = true, br2 = true;
					if(esc == true) {
						if(w > 0) {
							if(w == 1) {
								
								for(int i = 2; i < e; i++) {
									if(v[i].getValor()-v[i-1].getValor() != 1){
										br = false;
									}
								}
								if(br == true) {
									System.out.println("¿Joker al principio o al final?");
									String pr = in.next();
									if(pr.equals("principio")) sp = v[1].getValor()-1;
									else if(pr.equals("final")) sp = v[e-1].getValor()+1;
								}
								else {
									for(int i = 2; i <= e; i++) {
										if(v[i].getValor()-v[i-1].getValor() != 1) {
											sp = v[i].getValor()-1; break;
										}
									}
								}
								v[e].setValor(sp);
								m.ordenar(v, e);

							} else if(w == 2) {
								int pdf = 0;
								for(int i = 2; i < e-1; i++) {
									if(v[i].getValor()-v[i-1].getValor() != 1 && v[i].getValor() != 22){
										br = false;  pdf = i; break;
									}
								}
								
								for(int i = 2; i < e-1; i++) {
									if(v[i].getValor()-v[i-1].getValor() != 1 && v[i].getValor() != 22){
										if(br == false && i != pdf) br2 = false;
									}
								}
								
								if(br == false && br2 == false) {
									for(int i = 2; i < e-1; i++) {
										if(v[i].getValor()-v[i-1].getValor() != 1) {
											if(sp == 0) {
												sp = v[i].getValor()-1;
											} else sp1 = v[i].getValor()-1;
										}
									} System.out.println(sp + " " + sp1);
									
								}  else if(br == true && br2 == true){
									sp = v[1].getValor()-1; sp1 = v[e-2].getValor()+1;
								} else {
									System.out.println("¿Joker al principio o al final?");
									String pr = in.next();
									if(pr.equals("principio")) sp = v[1].getValor()-1;
									else if(pr.equals("final")) sp = v[e-2].getValor()+1;
									
									for(int i = 2; i < e-1; i++) {
										if(v[i].getValor()-v[i-1].getValor() != 1) {
											sp1 = v[i].getValor()-1; break;
										}
									}
								}
								v[e-1].setValor(sp); v[e].setValor(sp1); m.ordenar(v, e);
							}
						} 
						b = m.verescalera(v, e);
					}

				} else {
					//trica
					int tri = 0;
					if(w == 0) {
						tri = e;
					} else tri = e-1;
					for(int i = 1; i <= tri; i++) {
						if(v[i].getValor()==22)
						{
							for(int j=1;j<=tri;j++)
							{
								if(v[j].getValor()==22)
								{
									v[i].setValor(v[j].getValor());
								}
							}
						}
						if(v[i].getValor() != v[1].getValor()) {
							b = false; break;
						}
					} if (b == true) v[e].setValor(v[1].getValor());
				}
				if(b == true && esc == true) {
					for(int i = 1; i <= e; i++) {
						me.agregar(v[i], i, e);
						m.quitar(v[i]);
					}
				} else System.out.println("error"); 
			} else {
				System.out.println("error");
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
		 public void agregar(Carta c){
				//m.setNroCartas(m.getNroCartas()+1);
				m.añadir(c);

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
			        		me.agregar(v[i],i,e);
			        		m.quitar(v[i]);
			        		BR=true;
			        	}
			        }
		
			}
		 public void ordenar()
			{
				m.ordenar(m.getCa(),m.getNroCartas() );
			}
}
