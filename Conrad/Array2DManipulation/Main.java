class Main{

    static int array[][] = new int[5][8];

    public static void main(String args[]){
        sort sort = new sort();
        Main Main = new Main();
        int rows = 8;
        int c = 1;
        int cols = 5;
        search search = new search();    
        inputValidation s = new inputValidation();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                try{

                    array[j][i] = s.ask("Enter number: " + c, "Invalid input!", "^[-]?[0-9]*$", "int"); 
                }catch(Exception e){c--;}
                c++;
            }
        }
        Main.printArray(array,rows,cols);
        System.out.println();
        array = sort.sortArray(array);
        Main.printArray(array,rows,cols);
        search.searchElement(rows, cols);                                                 
        Main.printArrayCol(s.ask("\n\nWhich coloumn would you like to display?" , "Invalid input!", "[1-" + cols + "]", "int"), rows);

    }

    void printArray(int[][] arrays, int rows, int cols){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(array[j][i] + ", ");

            }  
            System.out.println();
        }
    }

    void printArrayCol(int col, int rows){

        for(int j = 0; j < rows; j++){

            System.out.println(array[col-1][j]);

        }
    }

}

