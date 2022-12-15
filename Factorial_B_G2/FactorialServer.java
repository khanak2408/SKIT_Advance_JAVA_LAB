import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class FactorialServer{
    public static void main(String args[]) throws Exception{
        Factorial f=new Factorial();
        LocateRegistry.createRegistry(1091);
        System.out.println("Registry created on port 1091");
        Naming.bind("//localhost:1091/praveen",f);
        System.out.println("Server is up and running");
    }
}