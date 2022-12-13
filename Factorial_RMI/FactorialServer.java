import java.rmi.*;
import java.rmi.registry.LocateRegistry;
public class FactorialServer{
    public static void main(String args[]) throws Exception{
        Factorial f=new Factorial();
        LocateRegistry.createRegistry(1091);
        System.out.println("Registry is create on the 1091 port");
        Naming.bind("//localhost:1091/praveen",f);
        System.out.print("Factorial Server is ready");
    }
}