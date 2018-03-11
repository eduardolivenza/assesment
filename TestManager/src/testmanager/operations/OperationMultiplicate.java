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
public class OperationMultiplicate extends Operation
{
    
     public OperationMultiplicate(String name, int addicionalValue)
    {
        this.name = name;
        this.factor = addicionalValue;
    }
    
     @Override
    public int ExecuteOperation(int value)
    {
         return (value * this.factor);
    }
}
