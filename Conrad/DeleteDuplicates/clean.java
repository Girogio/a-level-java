public class clean
{
    private String[] words = null; 

    public void removeDuplicates(String input)
    {
        words = input.split(" "); 
        for(int i=0;i<words.length;i++)          
        {
            if(words[i]!=null)
            {

                for(int j=i+1;j<words.length;j++)  
                {

                    if(words[i].equals(words[j]))   
                    {
                        words[j]=null;          
                    }
                }
            }
        }
    }
    private String output = "";
    public String clean(String input){
        // input = input.toLowerCase(); //enable for case sensitivity
        removeDuplicates(input);
        for(int k=0;k<words.length;k++)     
        {
            if(words[k]!=null)
            {
                output += words[k] + " ";
            }

        }  
        return output;
    }
}
