import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class Oblig2main {
	public static void main(String[] args) throws Exception {
		ArrayList<Bil> biler = new ArrayList<Bil>();
		Scanner lesFil = null;
		try {
			lesFil = new Scanner(new File(args[0]));
		}
		catch (Exception e) {
			System.out.println("Input error: " + e.getMessage());
			System.out.println("process terminated");
			return;
		}
		
		// lese fra fil
		while (lesFil.hasNextLine()) {
			String type = lesFil.next();
			if (type.equals("EL")) {
				biler.add(new Elbil(lesFil.next(), Double.parseDouble(lesFil.next())));
			}
			else if (type.equals("PERSONBIL")) {
				biler.add(new Personbil(lesFil.next(), Double.parseDouble(lesFil.next()), Integer.parseInt(lesFil.next())));
			}
			else if (type.equals("LASTEBIL")) {
				biler.add(new Lastebil(lesFil.next(), Double.parseDouble(lesFil.next()), Double.parseDouble(lesFil.next())));
			}
		}
		
		// skrive ut info om biler
		if (args.length == 1) {
			for (Bil b : biler) {
			b.skrivUt();
			}
		}
		else if (args[1].equals("EL")) {
			for (Bil b : biler) {
				if (b instanceof Elbil) {
					b.skrivUt();
				}
			}
		}
		else if (args[1].equals("FOSSIL")) {
			for (Bil b : biler) {
				if (b instanceof Fossilbil) {
					b.skrivUt();
				}
			}
		}
		else {
			System.out.println("Invalid command line argument");
		}
	}
}