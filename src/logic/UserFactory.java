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
public class UserFactory {
    
    public static UserInterface createUsersRestful() 
            throws OperationNotSupportedException{
        //The object to be returned.
        UserInterface userinterface=null;
        
        userinterface = new UserManager();
        
        return userinterface;
    }
}
