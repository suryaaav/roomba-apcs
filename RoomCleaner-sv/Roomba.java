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
		World.setDelay(10)

		Robot Roomba = new Robot(1, 1, East, 0);

		cleanRoom();
	}
	public static void cleanRoom() {
        while (true) {
            cleanRow();  // clean current row

            // If robot is facing east and can move down
            if (Roomba.facingEast()) {
                if (Roomba.frontIsClear()) {
                    Roomba.turnLeft();
                    Roomba.move();
                    Roomba.turnLeft();
                } else {
                    break;  // no more rows
                }
            }

            // If robot is facing west and can move down
            else if (Roomba.facingWest()) {
                if (Roomba.frontIsClear()) {
                    turnRight();
                    Roomba.move();
                    turnRight();
                } else {
                    break;  // no more rows
                }
            }
        }
    }

    // Clean one row
    public static void cleanRow() {
        while (Roomba.frontIsClear()) {
            // pick all beepers in this spot
            while (Roomba.nextToABeeper()) {
                Roomba.pickBeeper();
            }
            Roomba.move();
        }

        // check the last spot in the row
        while (Roomba.nextToABeeper()) {
            Roomba.pickBeeper();
        }
    }

    // Turn right (3 left turns)
    public static void turnRight() {
        Roomba.turnLeft();
        Roomba.turnLeft();
        Roomba.turnLeft();
    }




    


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


