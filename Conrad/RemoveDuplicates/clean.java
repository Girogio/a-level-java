public class clean
{
    private String sub = "";
    private String sub2 = " ";
    private int lastChar = 0;
    private int lastWord = 0;
    private String output = "";

    public String cleanString(String sentence){
        sentence = sentence + " ";
        for(int i = 0; i < sentence.length(); i++){

            if(sentence.charAt(i) == ' ' ){
                sub = sentence.substring(lastChar, i);
                lastChar = i;
                lastWord = i;

                for(int j = lastChar+1; j < sentence.length(); j++){
                    if(sentence.charAt(j) == ' '){
                        sub2 = sentence.substring(lastChar+1, j);
                        lastChar = j-1;
                        System.out.println(sub);
                        System.out.println(sub2);
                        //if dupe
                        if(sub.equals(sub2))
                        {
                            System.out.println("yeet");
                            System.out.println("\n" + sentence);
                            sentence = sentence.substring(0, lastWord) + sentence.substring(j, sentence.length());
                            System.out.println("\n" + sentence);

                            lastWord -= sub2.length();
                            lastChar -= sub2.length();

                        }
                        else
                        //if not dupe
                        {

                        }
                    }
                }

                lastChar = lastWord+1;
            }

        }
        return sentence;
    }
}
