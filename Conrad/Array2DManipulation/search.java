
class search{

    inputValidation s = new inputValidation();

    void searchElement(int rows, int cols){
        int e = 0;
        try{
            e =  s.ask("\n\nWhat element do you wish to look for?", "Invalid input!", "^[+-]?[0-9]*$", "int"); 
        }catch(Exception f){}
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if((Main.array[j][i] == e)){
                   
                    
                    //array position used.
                    //if coordinates are required increment i and j by one
                    System.out.print("\nElement " + e + ": found at " + i + ", " + j);
                    
                }
            }  
        }

    }

}