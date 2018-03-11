/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager;

import testmanager.operations.Operation;
import testmanager.tests.AbstractTest;

/**
 *
 * @author olivenze
 */
public class TestResults {
   
    private AbstractTest test;
    private Integer originalValue;

    public TestResults(){}
    
    public TestResults(AbstractTest test)
    {
        this.test = test;
    }
    
    public Integer getValue() {
        return originalValue;
    }

    public void setValue(Integer value) {
        this.originalValue = value;
    }
    
    public String getName()
    {
        return  this.test.getName();
    }
    
    public Integer getValueWithOperations()
    {
        Integer value = this.originalValue;
        if (value != null){
            for (Operation op: this.test.getTestOperations())
            {
                value = op.ExecuteOperation(value);
            }
            return value;
        }
        else
        {
            return null;
        }
    }
    
    @Override
    public String toString()
    {
        return this.getName();
    }
}
