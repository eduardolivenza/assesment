/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager.tests;

import testmanager.tests.samples.Sample;

/**
 *
 * @author olivenze
 */
public class TestFactory implements ITestFactory{
    
    private TestFactory(){}
    
    private static final TestFactory instance = new TestFactory();
    
    public static TestFactory getInstance(){
        return instance;
    }
    
    @Override
    public AbstractTest CrearBiochemistryTest(String name, Sample type)
    {
        AbstractTest test = new BioChemistryTest(name, type);
        return test;
    }
    
    @Override
    public AbstractTest CrearHemaetologyTest(String name, Sample type)
    {
        AbstractTest test = new HemaetologyTest(name, type);
        return test;
    }
    
    @Override
    public AbstractTest CrearMicrobiologyTest(String name, Sample type)
    {
        AbstractTest test = new MicrobiologyTest(name, type);
        return test;
    }   
    
    @Override
    public AbstractTest CrearImmunologyTest(String name, Sample type)
    {
        AbstractTest test = new ImmunologyTest(name, type);
        return test;
    }
    
}
