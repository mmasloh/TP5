package fr.uvsq.coo.ex3_3;

public class Employe {

	/** Cette classe avant modification ne respectait pas SRP car elle avait 2 responsabilités : 
	 * afficher les informations de l'employe et calculer son salaire
	 */
	private final String nom = "";
	private final String adresse = "";
	
	public String getNom() { return nom ;}
	public String getAdresse() { return adresse;}
		
}
