abstract class Bil {
	protected String skilt;
	
	// skrive ut info om bilen
	public void skrivUt() {
		System.out.println("\n" + skilt);
		if (this instanceof Elbil) {
			System.out.println("Elbil");
			System.out.println("Batterikapasitet: " + ((Elbil)this).getBK() + " kWh"); 
		}
		else if (this instanceof Fossilbil) {
			if (this instanceof Personbil) {
				System.out.println("Personbil");
				System.out.println("Antall seter: " + ((Personbil)this).getAntSeter());
			}
			else if (this instanceof Lastebil) {
				System.out.println("Lastebil");
				System.out.println("Nyttelast: " + ((Lastebil)this).getNyttelast() + " kg");
			}
			System.out.println("CO2-utslipp: " + ((Fossilbil)this).getUtslipp() + " g/km");
		}
	}
}