
class Table
{

    int table[][] = new int[9][3];

    void setPos(int i, int j, int num){
        this.table[i][j] = num; 
    }

    int getPos(int i, int j){
        return this.table[i][j];
    }
}