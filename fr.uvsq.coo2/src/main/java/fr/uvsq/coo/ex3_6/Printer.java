package fr.uvsq.coo.ex3_6;

public class Printer extends SimplePrinter {
	
	public void scan() {
		/***SCANNER***/
	}
	
	public void copy() {
		/*** COPIER ***/
		scan();
		super.print();
	}

}
