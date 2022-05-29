/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import Server.Chat;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Doth76
 */
public class ServerRMI {
    
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        
        LocateRegistry.createRegistry(1125); // start chat app  
        Chat chat1 = new Chat();
        String url = "rmi://localhost:1125/CHAT1" ;
        Naming.rebind(url,chat1);
    
        System.out.println(" "+ chat1.toString());
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
