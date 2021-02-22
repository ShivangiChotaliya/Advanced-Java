import java.rmi.*;

class MyClient {
    public static void main(String[] args) {
        try{
            Adder stub =(Adder) Naming.lookup("rmi://localhost:5000/mcaiv");
            System.out.println(stub.add(14,8));
        }catch(Exception e){System.out.println(e);}
    }
}
