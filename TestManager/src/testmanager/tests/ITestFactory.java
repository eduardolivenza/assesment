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
public interface ITestFactory 
{    
    public AbstractTest CrearBiochemistryTest(String name, Sample type);
    public AbstractTest CrearHemaetologyTest(String name, Sample type);
    public AbstractTest CrearMicrobiologyTest(String name, Sample type);
    public AbstractTest CrearImmunologyTest(String name, Sample type);
}
