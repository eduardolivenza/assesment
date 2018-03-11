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
public class OperationFactory implements IOperationFactory{
    
    private OperationFactory(){}
    
    private static final OperationFactory instance = new OperationFactory();
    
    public static OperationFactory getInstance(){
        return instance;
    }
    
    @Override
    public Operation crearOperationAdd(String name, int factor)
    {
        return new OperationAdd(name, factor);
    }
    
    @Override
    public Operation crearOperationMultiplicate(String name, int factor)
    {
        return new OperationMultiplicate(name,factor);
    }
}
