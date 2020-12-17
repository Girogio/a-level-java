import java.util.Scanner;
import java.util.InputMismatchException;

class run{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        game game = new game();
        grid grid = new grid();
        int shipNumber = 0;

        System.out.print("Hi welcome to Battleshipz - 'Z' standing for the boredom I have and the perfectionism put into this program.\n");
        System.out.print("\nHow many ships would you like to generate? (I recommend 3 for obvious reasons...)"); 

        do{
            try
            {
                shipNumber = s.nextInt();
                s.nextLine();
            }
            catch(InputMismatchException e){}

            if(shipNumber > 20)
                System.out.println("Come on, both you and me know we cant put that many ships on such a small board! Try a value of less than 20...");

        }while(shipNumber > 20 || shipNumber < 0);

        grid.initializeGrid();
        grid.generateShips(shipNumber);
        game.playGame();

    }

    public void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}