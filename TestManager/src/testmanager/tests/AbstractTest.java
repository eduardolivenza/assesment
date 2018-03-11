/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager.tests;

import java.util.ArrayList;
import testmanager.operations.Operation;
import testmanager.tests.samples.Sample;

/**
 *
 * @author olivenze
 */
public abstract class AbstractTest {
    
    private ArrayList<Operation> testOperations;
    private String name;
    private Sample sample;
    
    public void AddOperationTest(Operation o)
    {
        this.testOperations.add(o);
    }
     
    public String getTestInfo()
    {
        return " Test "+ name + " of type " + this.getClass() + " . Sample: " + this.sample.getString();
    }
    
    public void setName(String name) {
       this.name = name;
    }
    
    public String getName()
    {
        return  this.name;
    }
   
    public ArrayList<Operation> getTestOperations() {
        return testOperations;
    }

    public void setTestOperations(ArrayList<Operation> testOperations) {
        this.testOperations = testOperations;
    }

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }
    
    @Override
    public String toString()
    {
        return  this.name + " ("+ this.sample.getString()+")";
    }
    
    
}
