/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

/**
 *
 * @author olivenze
 */
public class Urine implements ISample {
    
    public Urine(){}
    
    public String getString()
    {
        return "Urine sample";
    }
    
    @Override
    public String toString()
    {
        return "Urine";
    }
}
