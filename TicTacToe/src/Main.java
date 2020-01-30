import java.util.Scanner;

public class Main {

    static Board b = new Board();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe.");
        b.initializeBoard();
        b.printEmptyBoard();

        //Move 1 - X
        playerCommand("x");

        //Move 1 - O
        playerCommand("o");

        //Move 2 - X
        playerCommand("x");

        //Move 2 - O
        playerCommand("o");

        //Move 3 - X
        playerCommand("x") ;

        //Move 3 - O
        playerCommand("o");

        //Move 4 - X
        playerCommand("x");

        //Move 4 - O
        playerCommand("o");

        //Move 5 - X
        playerCommand("x");

        //Move 5 - O
        playerCommand("o");
    }

    public static void playerCommand(String player){
        System.out.println("Player " + player + "'s turn. Indicate your move (x, y).");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(player.equals("x")){
            b.setMoveX(x, y);
        }else{
            b.setMoveO(x, y);
        }
        b.printBoard();
        if(b.checkWin()){
            System.out.println("Player " + player + " wins. Enter your victory message: ");
            String msg = scanner.nextLine();
            System.out.println(msg);
        }
        if(b.isBoardFull() && !b.checkWin()){
            System.out.println("Tie. y'all wack");
            System.exit(0);
        }
    }
}
