/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import javax.naming.OperationNotSupportedException;

/**
 *
 * @author Alain Lozano
 */
public class ClientFactory {
    public static ClientInterface createClientRestful() 
            throws OperationNotSupportedException{
        
        ClientInterface clientInterface=null;
        
        clientInterface = new ClientManager();
        
        return clientInterface;
    }
}
