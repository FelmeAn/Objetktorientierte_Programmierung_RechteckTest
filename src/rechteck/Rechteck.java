package rechteck;

public class Rechteck {
	double l�nge;
	double breite;

	public Rechteck(double l�nge, double breite) {
		this.l�nge = l�nge;
		this.breite = breite;
	}


	private double fl�che_berechnen() {
		return l�nge * breite;
	}
	
	private double umfang_berechnen() {
		return (2*l�nge)+(2*breite);
	}

	public void ausgeben() {
		System.out.println("Die Fl�che hat " + fl�che_berechnen() + " m�.\nDer Umfang ist "+umfang_berechnen()+" Meter.");
	}
}
