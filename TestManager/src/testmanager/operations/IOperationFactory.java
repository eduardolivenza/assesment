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
public interface IOperationFactory {
    
    public Operation crearOperationAdd(String name, int factor);
    public Operation crearOperationMultiplicate(String name, int factor);
}
