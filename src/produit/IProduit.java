package produit;

public interface IProduit {

	String getNom();

	Unite getUnite();

	double calculerPrix(int prix);

	String description();

}