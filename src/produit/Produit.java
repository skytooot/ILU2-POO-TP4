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
	
	public double calculerPrix(int prix) {
		return prix;
		
	}

	public String description() {
		switch (this.nom) {
		case "Sanglier":
			return "pour la vente de sanglier, il aura un billot int�gr� afin de pouvoir effectuer la d�coupe de la viande.\n";
		case "Poisson":
			return "pour vendre du poisson, il aura un rev�tement en c�ramique afin de pouvoir le nettoyer facilement.\n";
		default:
			return "";

		}
	}
	
}
