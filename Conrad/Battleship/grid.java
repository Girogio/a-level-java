import java.util.ArrayList;
class grid{
    static  int rows = 5;
    static  int coloumns = 5;
    char hitMarker = '⛴';
    boolean debug = false;
    char debugHitMarker = 'D';
    char missMarker = '\u25A1';
    char emptyMarker = '■';

    int x, y;

    static ArrayList<Ship> list = new ArrayList<Ship>();

    static  char[][] grid = new char[rows][coloumns];

    void initializeGrid(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j<coloumns; j++){
                grid[i][j] = emptyMarker;  
            }
        }

    }

    void setGrid(int x, int y, char letter){

        grid[y][x] = letter;   

    }

    void generateShips(int num){

        for(int i = 0; i < num; i++){
            list.add(new Ship(-2, -2)); //empty invalid ship - will not be a duplicate for sure

            //coords gen
            x = (int)(Math.random() * (rows));
            y = (int)(Math.random() * (rows)); 

            //debug 
            //print coords
            //System.out.println((x+1) + ", " + (y+1) + ", " + i);
            for(int j = 0; j < list.size(); j++){
                if(x == list.get(j).x){
                    if(y == list.get(j).y){
                        //debug
                        //System.out.print("Duplicate found");
                        i--;
                        break;
                    }
                }

            }

            //set arraylist
            list.get(i).x = x;
            list.get(i).y = y;
            //upate bidimensional array only if debug mode to see ships
            if(debug)
                setGrid(list.get(i).getX(),list.get(i).getY(), debugHitMarker);

        }
    }

    void printGrid(){
        for(int j = 0; j < coloumns; j++){
            System.out.print(j+1 + "   ");
        }
        System.out.println("\n");
        for(int i = 0; i < rows; i++){   
            for(int j = 0; j<coloumns; j++){

                System.out.print(grid[i][j] + "   ");  

            }
            System.out.print(i+1 + " ");
            System.out.println("\n");
        }
        System.out.print("   ");

    }

}
