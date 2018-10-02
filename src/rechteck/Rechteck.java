package rechteck;

public class Rechteck {
	double länge;
	double breite;

	public Rechteck(double länge, double breite) {
		this.länge = länge;
		this.breite = breite;
	}


	private double fläche_berechnen() {
		return länge * breite;
	}
	
	private double umfang_berechnen() {
		return (2*länge)+(2*breite);
	}

	public void ausgeben() {
		System.out.println("Die Fläche hat " + fläche_berechnen() + " m².\nDer Umfang ist "+umfang_berechnen()+" Meter.");
	}
}
