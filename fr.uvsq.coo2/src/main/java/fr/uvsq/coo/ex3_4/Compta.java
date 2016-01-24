package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;

public class Compta {
	
	 ArrayList<Employe> employés; 
	 int nb_employee;
	 
	 int somme_totale_salaire(){
		 int somme = 0; 
		 int i;
		 for ( i=0; i< nb_employee; i++)
			 somme += employés.get(i).salaire();
		 return somme;
	
	 }
	 

}
