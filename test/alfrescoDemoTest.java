package alfrescoDemoTest;

import alfrescoDemo.CheckFormation;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class alfrescoDemoTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public alfrescoDemoTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( alfrescoDemoTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    /** 
     *    test isFormed with the demo Strings.
     */
    
    public void testIsFormed(){
    	
    	CheckFormation formM = new CheckFormation();
    	assertTrue(formM.isFormed("[dog] "));
    	assertTrue(formM.isFormed("dog[A]"));
    	assertTrue(formM.isFormed("(dog[A]) "));
    	assertTrue(formM.isFormed("({dog}) "));
    	assertFalse(formM.isFormed("(A}B)C} "));
    
    	
    	
    	
    	
    	
    }
    
    
    
}
