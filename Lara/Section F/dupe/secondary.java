package dupe;

class secondary{
    int duplicates= 0;
    public int duplicateNumber(String str){
        char[] carray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    duplicates++;
                    break;
                }
            }

        } 
        return duplicates;
    }

}