// Make the board class that has the toString method
// used runestone 1.15 and 3.6
import java.util.Scanner;
public class Board{
	private String[] shipNames = {"Cruiser (Length 5)", "Battleship (Length 4)", "Destroyer (Length 3)", "Submarine (Length 3)", "Patrol (Length 2)"};
	private int[] shipLengths = {5,4,3,3,2};
	Scanner s1 = new Scanner (System.in);
    String boardShips[][] = new String[10][10];
    String boardGuess[][] = new String[10][10];
    public Board() { // define a standard board as empty
        for (int i = 0; i<boardShips.length;i++ ){
            for (int n = 0; n<boardShips[i].length; n++){
                boardShips[i][n]= " - ";//loop through and fill with " - "
                
            }

        }
        for (int i = 0; i<boardGuess.length;i++ ){
            for (int n = 0; n<boardGuess[i].length; n++){
                boardGuess[i][n]= " - ";//loop through and fill with " - "
                
            }

        }
        
    }
    public String[] toString(){
        String result1 = "";
        for (int i = 0; i<boardShips.length;i++ ){
            for (int n = 0; n<boardShips[i].length; n++){
                result1 += board[i][n];// loop through and print out each element
            }
            result1 += "\n";//line break every 10

        }
        String result2 = "";
        for (int i = 0; i<boardGuess.length;i++ ){
            for (int n = 0; n<boardGuess[i].length; n++){
                result2 += boardGuess[i][n];// loop through and print out each element
            }
            result2 += "\n";//line break every 10

        }
        String[] result = {result1,result2}
        return result;
    }
    
    
    
	public int[] convertCoords(String row, int column){
			int[] translate = {0,column};
			row = row.charAt(0);
			if (((int)(row))>=97 && ((int)(row))<=106){
				translate[i] = ((int)(row))-97; 
			}
			else if (((int)(coords[0]))>=65 && ((int)(coords[0]))<=74){
				translate[i] = ((int)(row))-65; 
			}
			else {
			 System.out.println("Invalid entry of coordinates");
			 translate = {11,11};
			 	
			}
			return translate;
			// if char =="r'||char =='R'
		}
    
    
    public void clearBoard(Board b){
		for (int i = 0; i<b.length;i++ ){
            for (int n = 0; n<b[i].length; n++){
                b[i][n]= " - ";//loop through and fill with " - "
                
            }

        }
	}
    
    public void clearBoards(){
        for (int i = 0; i<boardShips.length;i++ ){
            for (int n = 0; n<boardShips[i].length; n++){
                boardShips[i][n]= " - ";//loop through and fill with " - "
                
            }

        }
        for (int i = 0; i<boardGuess.length;i++ ){
            for (int n = 0; n<boardGuess[i].length; n++){
                boardGuess[i][n]= " - ";//loop through and fill with " - "
                
            }

        }
}
    
	public boolean checkPlacement(int[] coords,int shipNumber){
		int shipLength = shipLengths[shipNumber];
		for(int i =0; i<shiplength; i++){
			if(i>=10){
				return false;
			}
		}
		return true;

		//figure out how to check vlidity of placement
		}

	/*
	I already have a start on the placeShips methods which references
	the checkPlacement method

	Pseudocode:
	1. Prompt users for each ship
	2. Store each variable like row and column
	3. Ask for horizontal or vertical (starting the ship placement
	   at the top left coordinate the user input[will have to inform the use of this])
	4. Check with the length of the ship that the ship will not be outside of the 10x10
	   battleship grid
	5. If the battleship would be outside of the grid inform the user that this has happened
	   and reprompt the user to enter a valid coordinate
	6. Loop through all of the ships until all of them have been placed upon the grid
	7. Print out the grid to show the user where the placemnet have been made
	8. Another version that does not print anything out may be needed in order for the
	   computer to place its own ships as well


building on my current code...
	   
	    public void placeShips(Board b){
        for(int i = 0; i<shipNames.length; i++){
			b.clearBoard();
			System.out.println("Place " + shipNames[i]+ "\n\n Where would you like to place the "+shipNames[i]" \nRow Letter (A-J): ");
			String row = scan.nextLine();
			System.out.println("Column (Integer from 1-10): ");
			int column = (scan.nextInt()-1);
			String temp = scan.nextLine();
			System.out.println("Horizontal (H) or Vertical (V): ");
			// work here to get horizonatl and verical
			int[] coords = b.convertCoords(row,column);
			if (checkPlacement)
			else{
			 i--;
			 REPROMPT User to enter another location and recheck (do while?)
			 
			}
			Print (b);
		
		
		
	
	
	
	*/
    public void placeShips(){
        for(int i = 0; i<shipNames.length; i++){
			clearBoard(boardGuess);
			System.out.println("Place " + shipNames[i]+ "\n\n Where would you like to place the "+shipNames[i]" \nRow Letter (A-J): ");
			String row = scan.nextLine();
			System.out.println("Column (Integer from 1-10): ");
			int column = (scan.nextInt()-1);
			String temp = scan.nextLine();
			System.out.println("Horizontal (H) or Vertical (V): ");
			boolean vertical = (scan.nextLine()=='H');
			int[] coords = b.convertCoords(row,column);
			if (checkPlacement&&(!vertical)){
				for (int n = 0; n < shipLengths[i];n++ ){
					board[coords[0],(coords[1]+n)];
				}
			}
			// do vertical next
			else{
			 i--;	
			}
		
	}
        

    }

}
}
