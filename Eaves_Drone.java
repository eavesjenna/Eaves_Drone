import java.util.Scanner;
// Author Name: Jenna Eaves
// Date: 08/28/2020
// Program Name: Eaves_Drone
// Purpose: Simulation using button, drone movement in x, y, z location

public class Eaves_Drone {
	
	public static final int MOVE_UP = 1;
	public static final int MOVE_DOWN = 2;
	public static final int MOVE_FORWARD = 3;
	public static final int MOVE_BACKWARD = 4;
	public static final int TURN_LEFT = 5;
	public static final int TURN_RIGHT = 6;
	public static final int DISPLAY_POSITION = 7;
	public static final int EXIT_NAVIGATION = 8;
	public static final String INVALID_INPUT_ERROR_MSG = "Invalid input!";
	public static final String NAVIGATION_ENDING_MSG = "Exiting Navigation....";
	
	public static void main(String[] args) {
		
		int userInput = 0;
		Scanner scanner = new Scanner(System.in);	
		do {
			userInput = getUserAction(scanner);
			
			switch (userInput) {
			
				case MOVE_UP:
					moveUp(scanner);
					break;
				
				case MOVE_DOWN:
					moveDown(scanner);
					break;
					
				case MOVE_FORWARD:
					moveForward(scanner);
					break;
					
				case MOVE_BACKWARD:
					moveBackward(scanner);
					break;
					
				case TURN_LEFT:
					turnLeft(scanner);
					break;
					
				case TURN_RIGHT:
					turnRight(scanner);
					break;
					
				case DISPLAY_POSITION:
					displayPosition(scanner);
					break;
					
				case EXIT_NAVIGATION:
					System.out.print(NAVIGATION_ENDING_MSG);
					break;
					
				default :
					System.out.print(INVALID_INPUT_ERROR_MSG);
			}
		} while (userInput != EXIT_NAVIGATION);
}
	public static int getUserAction (Scanner scanner) {
		int userAction = 0;
		System.out.println("Which direction would you like to move the drone?");
		System.out.println(MOVE_UP + "- Move Up");
		System.out.println(MOVE_DOWN + "- Move Down");
		System.out.println(MOVE_FORWARD + "- Move Forward");
		System.out.println(MOVE_BACKWARD + "- Move Backward");
		System.out.println(TURN_LEFT + "- Turn Left");
		System.out.println(TURN_RIGHT + "- Turn Right");
		System.out.println(DISPLAY_POSITION + "- Display Position");
		System.out.println(EXIT_NAVIGATION + "- Exit Navigation");
		userAction = scanner.nextInt();
		scanner.nextLine();
		return userAction;	
	}
	
	public static void moveUp(Scanner scanner){
		
		System.out.println("You have moved up");
	}
	
	public static void moveDown(Scanner scanner) {
		
		System.out.println("You have moved down");
	}
	
	public static void moveForward(Scanner scanner) {
		
		System.out.println("You have moved forward");
	}
	
	public static void moveBackward(Scanner scanner) {
		
		System.out.println("You have moved backward");
	}
	
	public static void turnLeft(Scanner scanner) {
		
		System.out.println("You have turned left");
	}
	
	public static void turnRight(Scanner scanner) {
		
		System.out.println("You have turned right");
	}
	
	public static void displayPosition(Scanner scanner) {
	
	//	System.out.println(Drone.toString());
	}
	
class Drone {
	
	int x, y, z;
	String orientation;
	
	public Drone(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Drone() {
		x = 0;
		y = 0;
		z = 0; 
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int newZ) {
		this.z = newZ;
	}
	
	public String toString() {
		return "Student_Drone [x_pos=" + this.x + ", y_pos=" + this.y + ", z_pos" 
				+ this.z + ", orientation=" + orientation;
	}
}
	
	

}
