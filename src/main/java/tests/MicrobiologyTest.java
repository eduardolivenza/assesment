package tests;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import operations.OperationB;
import samples.ISample;

/**
 *
 * @author olivenze
 */
public class MicrobiologyTest extends AbstractTest implements IMicroTest, OperationB
{
   
    public MicrobiologyTest(String name, ISample type)
    {
        this.setName(name);
        this.setSample(type);
    }

    public void executeOperationB(Integer value) {
        System.out.println("Executing operation B for micro test");
    }
}
