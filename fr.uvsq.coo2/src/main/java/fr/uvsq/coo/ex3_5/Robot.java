package fr.uvsq.coo.ex3_5;

/** Un programme qui respecte le principe LSP doit respecter la notion suivante : 
 *  si S est un sous-type de T, alors tout objet de type T peut être remplacé par 
 *  un objet de type S sans altérer les propriétés désirables du programme concerné.
 *  
 *  Dans ce cas le type robot statique est un sous type de robot, mais un robot 
 *  qui peut avancer ne peut pas etre remplacé par un robot statique.
 *  
 * @author Melissa
 *
 */
public class Robot {
	
	public enum Direction {
		   NORD, OUEST, SUD, EST;
		}
	
	private Position position;
	private Direction direction; 
	
	/** le robot tourne dans le sens des aiguilles d'une montre **/
	
	public void tourne(){
		if( direction == Direction.NORD ) direction = Direction.OUEST;
		if( direction == Direction.OUEST ) direction = Direction.SUD;
		if( direction == Direction.SUD ) direction = Direction.EST;
		if( direction == Direction.EST ) direction = Direction.NORD;
	}
	
	public void avance(){
		{
			if( direction == Direction.NORD ) position.y++ ;
			if( direction == Direction.OUEST ) position.x-- ;
			if( direction == Direction.SUD ) position.y-- ;
			if( direction == Direction.EST ) position.x++ ;
			
		}
		
	}

}
