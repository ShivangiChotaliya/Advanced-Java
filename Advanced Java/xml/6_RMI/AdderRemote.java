import java.rmi.*;
import java.rmi.server.*;

class AdderRemote extends UnicastRemoteObject implements Adder{
    AdderRemote() throws RemoteException{
        super();
    }
    public int add(int x,int y){return x+y;};
}
