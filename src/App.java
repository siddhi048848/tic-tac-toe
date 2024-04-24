import board.Board;  //import the class board from board package
import java.util.Scanner;
import player.Player;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("First project-> Tic Tac Toe");

        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter board size :");
        int size=scn.nextInt();
        System.out.println("Please enter default symbol :");
         
        char defaultsymbol =scn.next().charAt(0);
        

        Board b=new Board(size,defaultsymbol);
        b.printBoardConfig();
       
        System.out.println("Please enter the name of player 1 : ");
        String name1 =scn.nextLine();
        
        System.out.println("Please enter the symbol of player 1:");
        char symbol1=scn.nextLine().charAt(0);

        Player p1=new Player();
        p1.setPlayerNameAndSymbol(name1,symbol1);
        //p1.setPlayerDetails("Siddhi",'x',"Bihar","6203882414","2022ugcs040@nitjsr.ac.in",20);
        p1.getPlayerNameAndSymbol();

        System.out.println("Please enter the name of player 2 : ");
        String name2=scn.nextLine();

        System.out.println("Please enter the symbol of player 2:");
        char symbol2=scn.nextLine().charAt(0);

        Player p2=new Player();
        p2.setPlayerNameAndSymbol(name2,symbol2);
        p2.getPlayerNameAndSymbol();

        Game game =new Game(new Player[] {p1,p2},b);
        game.play();
    }
}
