//import java.util.Scanner;  //may be necessary for input

//import javax.swing.JOptionPane;  //may be necessary for input
import kareltherobot.*;

public class Roomba implements Directions {

	private static Robot Roomba; 


	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		//Driver d = new Driver();

		World.readWorld("basicRoom.wld");
		World.setSize(15,15);
    	World.setVisible(true);

		Robot r = new Robot(10, 10, North, 0);
    String wrldName = "basicRoom.wld";

		while(r.nextToABeeper());
		r.pickBeeper();

    


	/** This section will have all the logic that takes the Robot to every location 
	 * and cleans up all piles of beepers.  Think about ways you can break this
	 * large, complex task into smaller, easier to solve problems.
	 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?
	//	roomba.move();


  





  	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */

  //  System.out.println("The biggest pile was ");








  }

}
