class Cypher
{

    public String decryptString(String string){
        String decrypted = "";
        for(int i = 0; i < string.length(); i++){
            char letter = string.charAt(i);
            if(Character.isUpperCase(letter)){
                if((int)string.toCharArray()[i] > 64 + 7)
                    decrypted += (char) (string.toCharArray()[i] - 7);   
                else if((int)string.toCharArray()[i] > 65+26 - 7)
                    decrypted += (char) (string.toCharArray()[i]  - 26 - 7);   
                else if ((int) string.toCharArray()[i] == 32)
                    decrypted += " ";   
                else 
                    decrypted += (char) ((int) string.toCharArray()[i] -  7 + 26);   
            }else{

                if((int)string.toCharArray()[i] > 96+7)
                    decrypted += (char) (string.toCharArray()[i] - 7);   
                else if((int)string.toCharArray()[i] > 96+26 - 7)
                    decrypted += (char) (string.toCharArray()[i] - 26 - 7);   
                else if ((int) string.toCharArray()[i] == 32)
                    decrypted += " ";   
                else 
                    decrypted += (char) ((int) string.toCharArray()[i] - 7 + 26);   
            }
        }

        return decrypted; 
    }

    public String encryptString(String string){
        String encrypted = "";
        for(int i = 0; i < string.length(); i++){
            char letter = string.charAt(i);
            if(Character.isUpperCase(letter)){
                if((int)string.toCharArray()[i] > 64 + 26 - 7)
                    encrypted += (char) (string.toCharArray()[i] - 26 + 7);   
                else if ((int) string.toCharArray()[i] == 32)
                    encrypted += " ";   
                else 
                    encrypted += (char) ((int) string.toCharArray()[i] + 7);   
            }else{

                if((int)string.toCharArray()[i] > 96+26-7)
                    encrypted += (char) (string.toCharArray()[i] - 26 + 7);   
                else if ((int) string.toCharArray()[i] == 32)
                    encrypted += " ";   
                else 
                    encrypted += (char) ((int) string.toCharArray()[i] + 7);   
            }
        }

        return encrypted; 
    }

}
