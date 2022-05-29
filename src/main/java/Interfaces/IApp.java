package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author Doth76
 */
public interface IApp extends Remote {
    public void response(String msg) throws RemoteException;
    
}
