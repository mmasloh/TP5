package fr.uvsq.coo.ex3_8;

import java.time.LocalDate;
import java.util.ArrayList;


public final class Personnel implements Element{
	
	private final String nom ;
	private final String prenom ;
	
	private final LocalDate naissance;
	private final ArrayList<String> telephones; 
	private final String fonction;
	
	
	public static class Builder {
		
		private final String nom ;
		private final String prenom ;
		
		private LocalDate naissance = null ;
		private ArrayList<String> telephones = null ;
		private String fonction = "";
		
		public Builder( String n , String p ) {
			this.nom = n; 
			this.prenom = p;
		}
		
		public Builder naissance ( LocalDate d){
			naissance = d;
			return this;
		}
		
		public Builder telephones ( ArrayList<String> l ) {
			telephones = l;
			return this;
		}
		
		public Builder fonction( String f){
			fonction = f;
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	private Personnel (Builder builder) {
		// Required parameters
		nom     = builder.nom;
		prenom = builder.prenom;

		// Optional parameters
		naissance         = builder.naissance;
		telephones          = builder.telephones; 
		fonction 			= builder.fonction;
	}
	
	 public void afficher(){
		 
		 System.out.println(this.nom + " " + this.prenom );
			
		}
	
   
	
}