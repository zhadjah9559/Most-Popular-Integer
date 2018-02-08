package MostPopularInt;

public class MostPopularInt 
{

    public static void main(String[] args) 
    {
        int[] array = {16,16,42,42,42,16,17,95,55,95,95,16,42,66,155,16};
        int element=0;
        int count = 0;
        
        System.out.println("This program takes integer input from the user and "
                + "displays which integer is most frequent.\n" );
        
            for(int i = 0; i<array.length; i++)
            {
                int currentCount = 0;
                int currentElement = array[i];
                
                for(int j = 1; j<array.length; j++)
                {
                    if(array[j] == currentElement)
                        currentCount++;
                    if(currentCount > count)
                    {
                        element = currentElement;
                        count = currentCount;
                    }
                }
            }       
        System.out.println("The most frequent integer value is: " + element);
    }
   
    
}
