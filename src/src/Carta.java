package src;

public class Carta {
	    private String nombre;
		private String palo;
		private int valor;
	    private int numero;
	        
		public Carta(String nombre, String palo, int valor, int numero) {
			this.nombre = nombre;
			this.palo = palo;
			this.valor = valor;
	        this.numero = numero;
		}

	    public int getNumero() {
	        return numero;
	    }

	    public void setNumero(int numero) {
	        this.numero = numero;
	    }
		
		public Carta()
		{
			nombre="as";
			palo="espadas";
			valor=11; 
			numero=1;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getPalo() {
			return palo;
		}

		public void setPalo(String palo) {
			this.palo = palo;
		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}
		public void mostrar()
		{
			System.out.println(nombre+" "+palo);
		}
	    
}


