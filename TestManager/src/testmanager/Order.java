/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager;

import java.util.ArrayList;
import java.util.HashMap;
import testmanager.tests.AbstractTest;

/**
 *
 * @author olivenze
 */
public class Order {
    
    private final HashMap<String, TestResults> testResults; 
    private final String sampleId;
    
    public Order(String sampleId)
    {
        this.testResults = new HashMap<>();
        this.sampleId = sampleId;
    }
    
    public void addTestToOrder(AbstractTest t, Integer resultValue)
    {
        TestResults tr = new TestResults(t);
        tr.setValue(resultValue);
        this.testResults.put(t.getName(), tr);
    }

    public ArrayList<TestResults> getTestResults() {
        ArrayList<TestResults> listOfValues = new ArrayList<>(this.testResults.values());
        return listOfValues;
    }

    public String getSampleId() {
        return sampleId;
    }
    
    @Override
    public String toString()
    {
        return this.sampleId;
    }
    
}
