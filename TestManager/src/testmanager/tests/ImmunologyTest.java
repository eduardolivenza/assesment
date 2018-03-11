/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager.tests;

import java.util.ArrayList;
import testmanager.tests.samples.Sample;

/**
 *
 * @author olivenze
 */
public class ImmunologyTest extends AbstractTest
{
   
    public ImmunologyTest(String name, Sample type)
    {
        this.setName(name);
        this.setSample(type);
        this.setTestOperations(new ArrayList<>());
    }

  
}
