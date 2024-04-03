package produit;

public abstract class Produit implements IProduit {
	private String nom;
	private Unite unite;
	
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public Unite getUnite() {
		return unite;
	}
	
	
}
