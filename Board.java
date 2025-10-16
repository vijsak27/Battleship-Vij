// Make the board class that has the toString method

public class Board{
    int board[][]= new int[10][10];
    public Board() { // define a standard board as empty
        for (int i = 0; i<board.length;i++ ){
            for (int n = 0; n<board[i].length; i++){
                board[i][n]= "-";//loop through and fill with "-"
            }

        }
        
    }
    public void toString(){
        for (int i = 0; i<board.length;i++ ){
            for (int n = 0; n<board[i].length; i++){
                System.out.print(board[i][n]);// loop through and print out each element
            }
            System.out.println("\n");//line break every 10

        }
    }

}