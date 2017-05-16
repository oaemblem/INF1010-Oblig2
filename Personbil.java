class Personbil extends Fossilbil {
	protected int antallSeter;
	
	// constructor
	public Personbil(String s, double c, int a) {
		skilt = s;
		co2Utslipp = c;
		antallSeter = a;
	}
	
	// getter
	public int getAntSeter() {
		return antallSeter;
	}
}