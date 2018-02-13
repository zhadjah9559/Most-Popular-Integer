/*
 * {Westfield State University}:Program Design 2
 * Zachary Hadjah
 * 
 */
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
        MostPopularInt mpi = new MostPopularInt();
        System.out.println("mostPopular method");
        assertEquals(mpi.mostPopular(), 16, EPSILON);
    }
    
}
