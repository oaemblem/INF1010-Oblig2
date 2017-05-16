class Lastebil extends Fossilbil {
	protected double nyttelast;
	
	// constructor
	public Lastebil(String s, double c, double n) {
		skilt = s;
		co2Utslipp = c;
		nyttelast = n;
	}
	
	// getter
	public double getNyttelast() {
		return nyttelast;
	}
}