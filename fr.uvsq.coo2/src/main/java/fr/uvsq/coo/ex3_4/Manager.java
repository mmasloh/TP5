package fr.uvsq.coo.ex3_4;

public class Manager extends Employe{
	
	int nb_sub ; 
	
	int salaire(){
		return super.salaire() +  100*nb_sub;
	}

}
