package produit;


public class Poisson extends Produit {
	private static String nom = "Poisson";
	private Unite unite = Unite.PIECE;
	private String date;
	
	public Poisson(String date) {
		this.date = date;
	}
}
