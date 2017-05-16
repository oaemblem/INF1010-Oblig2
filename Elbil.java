class Elbil extends Bil {
	protected double batterikapasitet;
	
	// constructor
	public Elbil(String s, double b) {
		skilt = s;
		batterikapasitet = b;
	}
	
	// getter
	public double getBK() {
		return batterikapasitet;
	}
}