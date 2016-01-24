package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.*;
import java.util.Queue;

public class Groupe implements Element {
	
	ArrayList<Element> Liste = new ArrayList<Element>();
	int type_parcours = 1; // 0 profondeur ; 1 largeur
	
	public void setType_parcours(int tp){
		this.type_parcours = tp; 
	}
	
	public void add(Element e) {
        Liste.add(e);
    }
	
	public void afficher(){
		
		if ( this.type_parcours == 0 ) this.afficher_prof();
		else this.afficher_long();
		
	}
	
	public void afficher_prof(){
		Iterator<Element> itr = Liste.iterator();
	      while(itr.hasNext()) {
	         Element e = itr.next();
	         e.afficher();
	      }   
	    System.out.println();
	}
	
	public void afficher_long(){
		
	}
	
}
