/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmanager.operations;

/**
 *
 * @author olivenze
 */
public abstract class Operation {
    
    String name;
    int factor;
    
    public abstract int ExecuteOperation(int value);
    
    public String toString()
    {
        return name;
    }
    
}
