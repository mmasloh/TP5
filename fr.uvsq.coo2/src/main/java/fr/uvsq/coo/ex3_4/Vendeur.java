package fr.uvsq.coo.ex3_4;

public class Vendeur extends Employe {
	
	int commission; 
	
	int salaire(){
		return super.salaire() + commission; 
	}

}
