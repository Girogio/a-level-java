class sort{

    
    //splits 2d array in single coloumned arrays and sorts
    int[][] sortArray(int[][] longarray){

        for (int i = 0; i < longarray.length; i++){
            longarray[i] = bSort(Main.array[i]);
        }

       return longarray;
    }
    
    
    
    
    //bubble sorts an array
    int[] bSort(int[] array){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < (array.length-i); j++){
                try{
                    if(array[j] > array[j+1]){
                        array = swap(j,j+1, array);
                    }
                }catch(Exception e)
                {}

            }

        }
        return array;
    }
    //swap indexes i and j in array 'array'
    int[] swap(int i, int j, int[] array){

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

        return array;
    }
}