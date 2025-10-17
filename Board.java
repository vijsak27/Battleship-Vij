// Make the board class that has the toString method
// used runestone 1.15 and 3.6
import java.util.Scanner;
public class Board{
	private String[] shipNames = {"Cruiser (Length 5)", "Battleship (Length 4)", "Destroyer (Length 3)", "Submarine (Length 3)", "Patrol (Length 2)"};
	Scanner s1 = new Scanner (System.in);
    String board[][]= new String[10][10];
    public Board() { // define a standard board as empty
        for (int i = 0; i<board.length;i++ ){
            for (int n = 0; n<board[i].length; n++){
                board[i][n]= " - ";//loop through and fill with " - "
                
            }

        }
        
    }
    public String toString(){
        String result = "";
        for (int i = 0; i<board.length;i++ ){
            for (int n = 0; n<board[i].length; n++){
                result += board[i][n];// loop through and print out each element
            }
            result+= "\n";//line break every 10

        }
        return result;
    }
	public int[] convertCoords(String row, int column){
			int[] translate = [0,column];
			row = row.charAt(0);
			if (((int)(row))>=97 && ((int)(row))<=106){
				translate[i] = ((int)(row))-97; 
			}
			else if (((int)(coords[0]))>=65 && ((int)(coords[0]))<=74){
				translate[i] = ((int)(row))-65; 
			}
			else {
			 System.out.println("Invalid entry of coordinates");	
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

    public void placeShips(Board b){
        for(int i = 0; i)
			System.out.println("Placing ships\n");
			b.clearBoard();
			System.out.println("Place Cruiser (length 5) \n\n Where would you like to place the Cruiser \n Row Letter (A-J): ");
			String row = scan.nextLine();
			System.out.println("Column (Integer from 1-10): ");
			int column = (scan.nextInt()-1);
			String temp = scan.nextLine();
			int[] coords = b.convertCoords(row,column);
		
        
        

    }

}
