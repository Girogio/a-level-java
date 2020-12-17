import java.util.regex.Pattern;
import java.util.Scanner;
class game{

    int tries = 10;
    int hits = 0;
    static grid grid = new grid();
    run run = new run();
    Scanner s = new Scanner(System.in);
    String x;
    String y;
    int xInt, yInt;

    void playGame(){
        do{
            if(hits == grid.list.size()){
                System.out.println("\f");
                grid.printGrid();
                System.out.println("\n\nYou win! Well done.!");
                return;

            }
            System.out.print("\f");
            grid.printGrid();

            do{
                System.out.println("\n\n Which row would you like to hit? (horizontal)");
                x = s.nextLine();
                if(!Pattern.matches("[1-5]{1}", x)){
                    System.out.println("Invalid input, please try again.");
                }

            }while(!Pattern.matches("[1-5]{1}", x));
            xInt = Integer.parseInt(x) - 1;

            do{
                System.out.println("\n\n Which coloumn would you like to hit? (vertical)");
                y = s.nextLine();
                if(!Pattern.matches("[1-5]{1}", y)){
                    System.out.println("Invalid input, please try again.");
                }

            }while(!Pattern.matches("[1-5]{1}", y));
            yInt =  Integer.parseInt(y) - 1;

            //if tried but already missed
            if(grid.grid[yInt][xInt] == grid.missMarker){

                tries++;
                System.out.println("\n\nPlease try again, you already tried to hit that coordinate and found nothing!");
                run.promptEnterKey();

            }

            //if tried but already hit
            else if(grid.grid[yInt][xInt] == grid.hitMarker){

                tries++;
                System.out.println("\n\nPlease try again, you already tried to hit that coordinate and already found a ship!");
                run.promptEnterKey();

            }
            //if tried but check for ship is there
            else if(grid.grid[yInt][xInt] == grid.emptyMarker || grid.grid[yInt][xInt] == grid.debugHitMarker){

                for(int i = 0; i < grid.list.size(); i++) {
                    if(xInt == grid.list.get(i).x && yInt == grid.list.get(i).y){
                        hits++;
                        grid.setGrid(xInt, yInt, grid.hitMarker);
                        System.out.print("\f");
                        grid.printGrid();
                        tries++;
                        System.out.println("\n\nGood job! You hit a ship at (" + (xInt+1) + ", " + (yInt+1) + ")");
                        run.promptEnterKey();
                        break;

                    }else if(i==grid.list.size()-1){
                        grid.setGrid(xInt, yInt, grid.missMarker);
                        System.out.print("\f");
                        grid.printGrid();
                        System.out.println("Missed :(");
                        run.promptEnterKey();
                        break;
                    }

                }
            }

            tries--;
        }while(tries > 0);

        System.out.print("\f");
        grid.printGrid();
        System.out.println("\n\nSorry but you used up all your tries :( You lost!");
    }
}