class brain{

    void printLetter(char letter){

        int letterNum = (int) letter - 'a'  + 1;
        System.out.println(letterNum);

        int cols=1;
        boolean half= false;
        int currentNum = 1;
        int spaces = letterNum-1;
        System.out.println();
        System.out.println();
        System.out.println();
        //rows
        for(int  i = 1; i <= (letterNum*2); i++){

            //cols
            for(int b = 0; b < spaces; b++){
                System.out.print(" ");
            }

            if(i<letterNum){
                currentNum = i;
                spaces--;
            }

            else{
                currentNum = (letterNum*2) - i;
                spaces++;
            }

            for(int j = 0; j < cols; j++){
                //print num
                System.out.print((char) ('a' + currentNum - 1));

                if(j < cols/2)
                    currentNum--;
                else
                    currentNum++;
            }

            if(i==letterNum){
                half = true;
            }
            if(half)
                cols-=2;
            else
                cols+=2;

            System.out.println();

        }

    }

    void printNumber(int num){
        int cols=1;
        boolean half= false;
        int currentNum = 1;
        int spaces = num-1;
        System.out.println();
        System.out.println();
        System.out.println();
        //rows
        for(int  i = 1; i <= (num*2); i++){

            //cols
            for(int b = 0; b < spaces; b++){
                System.out.print(" ");
            }

            if(i<num){
                currentNum = i;
                spaces--;
            }

            else{
                currentNum = (num*2) - i;
                spaces++;
            }

            for(int j = 0; j < cols; j++){
                //print num
                System.out.print(currentNum);

                if(j < cols/2)
                    currentNum--;
                else
                    currentNum++;
            }

            if(i==num){
                half = true;
            }
            if(half)
                cols-=2;
            else
                cols+=2;

            System.out.println();

        }
    }
}