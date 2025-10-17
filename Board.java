// Make the board class that has the toString method
// used runestone 1.15 and 3.6
public class Board{
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

    public void clearBoard(Board b){
        for (int i = 0; i<b.length;i++ ){
            for (int n = 0; n<b[i].length; n++){
                b[i][n]= " - ";//loop through and fill with " - "
                
            }

        }

    }

    public void placeShips(){
        System.out.println("Placing ships\n");

    }

}