package tests;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import samples.ISample;

/**
 *
 * @author olivenze
 */
public abstract class AbstractTest implements ITest {

    private String name;
    private ISample sample;

    public String getTestInfo() {
        return " Test "+ name + " of type " + this.getClass() + " . Sample: " + this.sample.getString();
    }
    
    public void setName(String name) {
       this.name = name;
    }
    
    public String getName() {
        return  this.name;
    }

    public ISample getSample() {
        return sample;
    }

    public void setSample(ISample sample) {
        this.sample = sample;
    }
    
    @Override
    public String toString()
    {
        return  this.name + " ("+ this.sample.getString()+")";
    }
    
    
}
