package fr.uvsq.coo.ex3_4;

/** pour respecter le principe OCP, le code a été conçu 
 * de façon a ce que si on veut ajouter une nouvelle catégorie 
 * d'employés, il n y a pas besoin de modifier le code de la 
 * classe Employe, il suffit simplement de créer une nouvelle classe 
 * qui extend la classe Employe
 * 
 *  
 * @author Melissa
 *
 */

public class Employe {

	private final String nom = "";
	private final String adresse = "";
	
	public String getNom() { return nom ;}
	public String getAdresse() { return adresse;}
	
	
	int annee_ancien; 
	
	int salaire() {
		return 1500 + 20*this.annee_ancien;
	}
}
