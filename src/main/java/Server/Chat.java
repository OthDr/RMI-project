/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.server.UnicastRemoteObject;
import Interfaces.IApp;
import java.rmi.RemoteException;

/**
 *
 * @author Doth76
 */
public class Chat extends UnicastRemoteObject implements IApp{

    public Chat() throws RemoteException {
    }
    
    

    
    @Override
    public void response(String msg) throws RemoteException {
        System.out.println("server responds for: "+msg);
    }
    
    
    
}
