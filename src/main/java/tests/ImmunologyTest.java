package tests;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import operations.OperationA;
import samples.ISample;


/**
 *
 * @author olivenze
 */
public class ImmunologyTest extends AbstractTest implements IImmunologyTest, OperationA
{
   
    public ImmunologyTest(String name, ISample type)
    {
        this.setName(name);
        this.setSample(type);
    }

    public void executeOperationA() {
        System.out.println("Executing operation A for Immuunology test");
    }
}
