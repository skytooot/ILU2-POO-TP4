package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private static String nom = "Sanglier";
	private static Unite unite = Unite.KILOGRAMME;
	private Gaulois chasseur;
	private int poids;
	
	public Sanglier( int poids, Gaulois chasseur) {
		this.poids = poids;
		this.chasseur = chasseur;
	}
}
