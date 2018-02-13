/*==============================================================================
Zachary Hadjah                      February 9th, 2018
Junior Year                         Side Project

Description:
This program takes an array populated with integers and displays what the most
popular element inside the array is. 

==============================================================================*/
package mostpopularint;

import java.util.Arrays;

public class MostPopularInt 
{
/**
 * 
 * @param args 
 */
    public static void main(String[] args) 
    {
        int[] array = {16,16,42,42,42,16,17,95,55,95,95,16,42,66,155,16};
        System.out.println("The given array is: " + Arrays.toString(array));        
        System.out.println("The most frequent integer value is: " + mostPopular(array));
    }
    
    /**
     * 
     * @param array
     * @return element
     */
    public static int mostPopular(int[] array)
    {
        int element=0;
        int count = 0;
        //loop that will take one element at a time
        for(int i = 0; i<array.length; i++)
        {
            int currentCount = 0;
            int currentElement = array[i];

            //loop that will compare the currentElement with the subsequent elements
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
        return element;
    }
}
