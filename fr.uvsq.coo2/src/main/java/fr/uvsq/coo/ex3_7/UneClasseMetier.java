

/**
 * 
 * PRINCIPE D'INVERSION DES DEPENDANCES
 * 
 * A. Les modules de haut niveau ne doivent pas dépendre de modules de bas niveau. 
 *    Tous deux doivent dépendre d'abstractions.
 *    
 * B. Les abstractions ne doivent pas dépendre de détails. 
 *    Les détails doivent dépendre d'abstractions.
 * 
 * 
 */
package fr.uvsq.coo.ex3_7;

import java.time.LocalDateTime;

public class UneClasseMetier {
	
	public void afficherDateDebut(){
		UneClasseAffichage.afficher( "DEBUT :" + LocalDateTime.now().toString() );
	}

	public void afficherDateFin() {
		UneClasseAffichage.afficher( "FIN :" + LocalDateTime.now().toString() );
	}
}
