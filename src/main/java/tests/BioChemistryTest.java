package tests;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import operations.OperationA;
import operations.OperationB;
import samples.ISample;


/**
 *
 * @author olivenze
 */
public class BioChemistryTest extends AbstractTest implements IBioChemistryTest, OperationB, OperationA
{
   
    public BioChemistryTest(String name, ISample type)
    {
        this.setName(name);
        this.setSample(type);
    }

    public void executeOperationA() {
        System.out.println("Exe operation A in  test with 2 operations");
    }

    public void executeOperationB(Integer value) {
        System.out.println("Exe operation B in test with 2 operations with parameter "+ value);
    }
}
