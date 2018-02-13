/*=============================================================================
This test class will create a new array with its most populat element being 67. 
The test will confirm that 67 is the most popular integer inside the array without
an assertion error being triggered.
==============================================================================*/
package mostpopularint;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zach
 */
public class MostPopularIntTest {
    static final double EPSILON = 0.001; 

    /**
     * 
     */
    public MostPopularIntTest() {
    }
    
    /**
     * Test of mostPopular method, of class MostPopularInt.
     */
    @Test
    public void testMostPopular() 
    {
        int[] testArray = {67,33,22,55,77,345,263,74,67,67,456,44,342}; 
        MostPopularInt mpi = new MostPopularInt();
        System.out.println("mostPopular method");
        assertEquals(mpi.mostPopular(testArray), 67, EPSILON);
    }
    
}
