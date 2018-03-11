/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager.tests;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import testmanager.tests.samples.Blood;

/**
 *
 * @author olivenze
 */
public class TestManagerCoreIT {
    
    public TestManagerCoreIT() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of addTest method, of class TestManagerCore.
     */
    @Test
    public void testAddTest() {
  
    }

    /**
     * Test of getTest method, of class TestManagerCore.
     */
    @Test
    public void testGetTest() {
        System.out.println("getTest");
        String index = "DummyTest";
        TestManagerCore instance = new TestManagerCore();
        AbstractTest expResult = null;
        AbstractTest result = instance.getTest(index);
        assertEquals(expResult, result);

    }

    /**
     * Test of getTestCollection method, of class TestManagerCore.
     */
    @Test
    public void testGetTestCollection() {
        String testCode1 = "DummyTest";
        String testCode2 = "DummyTest2";
        System.out.println("getTestCollection");
        TestManagerCore instance = new TestManagerCore();
        ArrayList<AbstractTest> expResult =  new ArrayList<>();
        ArrayList<AbstractTest> result = instance.getTestCollection();
        assertEquals(expResult, result);
        instance.addTest(testCode1, 0, new Blood());
        instance.addTest(testCode2, 0, new Blood());
        assertEquals("Two tests retrieved from test core manager", instance.getTestCollection().size(), 2 );
        assertEquals("First test retrieved matches test code introduce", instance.getTestCollection().get(1).getName(), testCode1 );
    }

    /**
     * Test of addOperationToTest method, of class TestManagerCore.
     */
    @Test
    public void testAddOperationToTest() {
        System.out.println("addOperationToTest");
        String testCode = "DummyTest";
        String opName = "opName";
        int opType = 0;
        int factor = 3;
        TestManagerCore instance = new TestManagerCore();
        instance.addTest(testCode, 0, new Blood());
        instance.addOperationToTest(testCode, opName, opType, factor);
        assertEquals("One operation stored in the given test", instance.getTest(testCode).getTestOperations().size(), 1 );
    }

 
    
}
