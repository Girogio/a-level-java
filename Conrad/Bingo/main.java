class main{

    public static void main(String args[]){

        tableGen tableGen = new tableGen();
        tableGen.createTable();
        for(int i = 0; i < storage.session.size(); i ++){

            for(int rows = 0; rows < 3; rows++){
                for(int cols = 0; cols < 9; cols++){
                    System.out.print(storage.session.get(i).getPos(cols,rows) + "\t");
                } 
                System.out.println();
            }

        }                System.out.println();
        System.out.print("------------------------------------------------------------------");
        System.out.println();

    }

}