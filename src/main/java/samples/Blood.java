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
public class Blood implements ISample {
 
    public Blood(){}

    public String getString()
    {
        return "Blood sample";
    }
    
    @Override
    public String toString()
    {
        return "Blood";
    }
    
}
