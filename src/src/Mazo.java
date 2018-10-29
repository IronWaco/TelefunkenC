package src;
public class Mazo {
	private int nroCartas;
	private Carta Ca[]=new Carta[109];
	public Mazo(int nroCartas, Carta[] ca) {
		this.nroCartas = nroCartas;
		Ca = ca;
	}
	public Mazo() {
		nroCartas = 109;
		Ca[1] = new Carta("as","espadas",11);
		Ca[2] = new Carta("2","espadas",2);
		Ca[3] = new Carta("3","espadas",3);
		Ca[4] = new Carta("4","espadas",4);
		Ca[5] = new Carta("5","espadas",5);
		Ca[6] = new Carta("6","espadas",6);
		Ca[7] = new Carta("7","espadas",7);
		Ca[8] = new Carta("8","espadas",8);
		Ca[9] = new Carta("9","espadas",9);
		Ca[10] = new Carta("10","espadas",10);
		Ca[11] = new Carta("Jack","espadas",11);
		Ca[12] = new Carta("Queen","espadas",11);
		Ca[13] = new Carta("king","espadas",11);
		Ca[14] = new Carta("as","espadas",11);
		Ca[15] = new Carta("2","espadas",2);
		Ca[16] = new Carta("3","espadas",3);
		Ca[17] = new Carta("4","espadas",4);
		Ca[18] = new Carta("5","espadas",5);
		Ca[19] = new Carta("6","espadas",6);
		Ca[20] = new Carta("7","espadas",7);
		Ca[21] = new Carta("8","espadas",8);
		Ca[22] = new Carta("9","espadas",9);
		Ca[23] = new Carta("10","espadas",10);
		Ca[24] = new Carta("Jack","espadas",11);
		Ca[25] = new Carta("Queen","espadas",11);
		Ca[26] = new Carta("king","espadas",11);
		Ca[27] = new Carta("as","trebol",11);
		Ca[28] = new Carta("2","trebol",2);
		Ca[29] = new Carta("3","trebol",3);
		Ca[30] = new Carta("4","trebol",4);
		Ca[31] = new Carta("5","trebol",5);
		Ca[32] = new Carta("6","trebol",6);
		Ca[33] = new Carta("7","trebol",7);
		Ca[34] = new Carta("8","trebol",8);
		Ca[35] = new Carta("9","trebol",9);
		Ca[36] = new Carta("10","trebol",10);
		Ca[37] = new Carta("Jack","trebol",11);
		Ca[38] = new Carta("Queen","trebol",11);
		Ca[39] = new Carta("king","trebol",11);
		Ca[40] = new Carta("as","trebol",11);
		Ca[41] = new Carta("2","trebol",2);
		Ca[42] = new Carta("3","trebol",3);
		Ca[43] = new Carta("4","trebol",4);
		Ca[44] = new Carta("5","trebol",5);
		Ca[45] = new Carta("6","trebol",6);
		Ca[46] = new Carta("7","trebol",7);
		Ca[47] = new Carta("8","trebol",8);
		Ca[48] = new Carta("9","trebol",9);
		Ca[49] = new Carta("10","trebol",10);
		Ca[50] = new Carta("Jack","trebol",11);
		Ca[51] = new Carta("Queen","trebol",11);
		Ca[52] = new Carta("king","trebol",11);
		Ca[53] = new Carta("as","corazon",11);
		Ca[54] = new Carta("2","corazon",2);
		Ca[55] = new Carta("3","corazon",3);
		Ca[56] = new Carta("4","corazon",4);
		Ca[57] = new Carta("5","corazon",5);
		Ca[58] = new Carta("6","corazon",6);
		Ca[59] = new Carta("7","corazon",7);
		Ca[60] = new Carta("8","corazon",8);
		Ca[61] = new Carta("9","corazon",9);
		Ca[62] = new Carta("10","corazon",10);
		Ca[63] = new Carta("Jack","corazon",11);
		Ca[64] = new Carta("Queen","corazon",11);
		Ca[65] = new Carta("king","corazon",11);
		Ca[66] = new Carta("as","corazon",11);
		Ca[67] = new Carta("2","corazon",2);
		Ca[68] = new Carta("3","corazon",3);
		Ca[69] = new Carta("4","corazon",4);
		Ca[70] = new Carta("5","corazon",5);
		Ca[71] = new Carta("6","corazon",6);
		Ca[72] = new Carta("7","corazon",7);
		Ca[73] = new Carta("8","corazon",8);
		Ca[74] = new Carta("9","corazon",9);
		Ca[75] = new Carta("10","corazon",10);
		Ca[76] = new Carta("Jack","corazon",11);
		Ca[77] = new Carta("Queen","corazon",11);
		Ca[78] = new Carta("king","corazon",11);
		Ca[79] = new Carta("as","diamante",11);
		Ca[80] = new Carta("2","diamante",2);
		Ca[81] = new Carta("3","diamante",3);
		Ca[82] = new Carta("4","diamante",4);
		Ca[83] = new Carta("5","diamante",5);
		Ca[84] = new Carta("6","diamante",6);
		Ca[85] = new Carta("7","diamante",7);
		Ca[86] = new Carta("8","diamante",8);
		Ca[87] = new Carta("9","diamante",9);
		Ca[88] = new Carta("10","diamante",10);
		Ca[89] = new Carta("Jack","diamante",11);
		Ca[90] = new Carta("Queen","diamante",11);
		Ca[91] = new Carta("king","diamante",11);
		Ca[92] = new Carta("as","diamante",11);
		Ca[93] = new Carta("2","diamante",2);
		Ca[94] = new Carta("3","diamante",3);
		Ca[95] = new Carta("4","diamante",4);
		Ca[96] = new Carta("5","diamante",5);
		Ca[97] = new Carta("6","diamante",6);
		Ca[98] = new Carta("7","diamante",7);
		Ca[99] = new Carta("8","diamante",8);
		Ca[100] = new Carta("9","diamante",9);
		Ca[101] = new Carta("10","diamante",10);
		Ca[102] = new Carta("Jack","diamante",11);
		Ca[103] = new Carta("Queen","diamante",11);
		Ca[104] = new Carta("king","diamante",11);
		Ca[105] = new Carta("Joker","n.a.",22);
		Ca[106] = new Carta("Joker","n.a.",22);
		Ca[107] = new Carta("Joker","n.a.",22);
		Ca[108] = new Carta("Joker","n.a.",22);
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

	
}
