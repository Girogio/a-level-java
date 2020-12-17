import java.util.*;
class tableGen{

    storage storage = new storage();
    int counter = 0;
    void createTable(){
        int table[][] = new int[9][3];
        Table t = new Table();
        for(int i = 0; i < 3; i++){

          
                for(int j = 0; j < 9; j++){
                    if(counter<=4)
                        t.setPos(j,i,(getRandomIntegerBetweenRange(0,9)+(j*10)));
                   
                    // t.setPos(j,i,0);
                    if(t.getPos(j,i) == 0)
                        counter++;

                }
            
            counter = 0;
        }
        storage.session.add(t);
    }

    /*  void genRow(){
    int local_rows[] = new int[9];      

    for(int i = 1; i <= local_rows.length; i++){
    local_rows[i] = -2;
    }

    for(int i = 1; i <= local_rows.length; i++){
    if(counter == 4)
    {
    do{
    local_rows[i] =  getRandomIntegerBetweenRange(0,10);
    }while (local_rows[i] == 0);
    }
    local_rows[i] =  getRandomIntegerBetweenRange(0,10);
    if(local_rows[i] == 0)
    counter++;
    }

    storage.rows.add(local_rows);
    }*/

    int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}