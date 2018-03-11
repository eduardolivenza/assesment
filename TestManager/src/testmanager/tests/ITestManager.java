/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager.tests;

import java.util.ArrayList;
import testmanager.tests.samples.*;

/**
 *
 * @author olivenze
 */
public interface ITestManager {
    
    public void addTest(String name, int item, Sample type);
    public void addOperationToTest(String testName, String opName, int opType, int factor);
    public AbstractTest getTest(String name);
    public ArrayList<AbstractTest> getTestCollection();
    
}
