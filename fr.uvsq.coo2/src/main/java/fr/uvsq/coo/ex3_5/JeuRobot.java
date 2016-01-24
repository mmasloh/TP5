package fr.uvsq.coo.ex3_5;

import java.util.ArrayList;

public class JeuRobot {
	
	ArrayList<Robot> robots;
	ArrayList<RobotStatique> robots_statiques;
	
	void avancerTous()
	{
		 int i;
		 for ( i=0; i< robots.size(); i++)
			 robots.get(i).avance();
	}
	

}
