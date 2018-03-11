/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager.tests;

import java.util.ArrayList;
import java.util.HashMap;
import testmanager.operations.IOperationFactory;
import testmanager.operations.Operation;
import testmanager.operations.OperationFactory;
import testmanager.tests.samples.Sample;

/**
 *
 * @author olivenze
 */
public class TestManagerCore implements ITestManager{
 
    
    private final HashMap<String, AbstractTest> testCollection;
    private final ITestFactory factory;
    private final IOperationFactory opFactory;
   
    public TestManagerCore()
    {
        this.testCollection = new HashMap<>();
        this.factory = TestFactory.getInstance();
        this.opFactory = OperationFactory.getInstance();
    }
    
    /**
     *
     * @param name
     * @param item
     * @param type
     */
    @Override
    public void addTest(String name, int item, Sample type)
    {
        AbstractTest test = null;
        if (item == 0)
        {
            test = factory.CrearBiochemistryTest(name, type);
        }
        if (item == 1)
        {
            test = factory.CrearImmunologyTest(name, type);
        }
        if (item == 2)
        {
            test = factory.CrearHemaetologyTest(name, type);
        }
        if (item == 3)
        {
            test = factory.CrearMicrobiologyTest(name, type);
        }
        this.testCollection.put( name, test);
    }
    
    /**
     * @param name
     * @return
     */
    @Override
    public AbstractTest getTest(String name)
    {
        try
        {
            return this.testCollection.get(name);
        }
        catch(Exception e)
        {
             return null;
        }   
    }
      
    
    @Override
    public  ArrayList<AbstractTest> getTestCollection(){
        ArrayList<AbstractTest> listOfValues = new ArrayList<>(this.testCollection.values());
        return listOfValues;
    }
    
    @Override
    public void addOperationToTest(String testName, String opName, int opType, int factor)
    {
        Operation o = null;
        if (opType == 0)
        {
            o = this.opFactory.crearOperationAdd(opName, factor);
        }
        else if (opType == 1)
        {
            o = this.opFactory.crearOperationMultiplicate(opName, factor);
        }
        AbstractTest t = this.getTest(testName);
        t.AddOperationTest(o);
    }
}
