package rechteck;

import java.util.Scanner;

public class RechteckTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------[EINGABE]------");
		System.out.print("Bitte gebe eine Länge in Metern an: ");
		double l = Double.parseDouble(sc.nextLine().replaceAll("\\D", ""));
		
		System.out.print("Bitte gebe eine Breite in Metern an: ");
		double b = Double.parseDouble(sc.nextLine().replaceAll("\\D", ""));
		sc.close();
		System.out.println("------[BERECHNUNG & AUSGABE]------");
		Rechteck nummer1 = new Rechteck(l, b);
		nummer1.ausgeben();
	}	

}
