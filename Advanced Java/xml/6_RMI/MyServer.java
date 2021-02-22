import java.rmi.*;
import java.rmi.server.*;

public class MyServer {
    public static void main(String[] args) throws Exception {
        Adder stub = new AdderRemote();
        Naming.rebind("rmi://localhost:5000/mcaiv", stub);
    }
}