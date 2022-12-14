import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
public class FactorialServer{
    public static void main(String args[]) throws Exception{
        Factorial hello=new Factorial();
        LocateRegistry.createRegistry(1091);
        System.out.println("Registry is created on port 1091");
        Naming.bind("//localhost:1091/praveen",hello);
        System.out.println("Factorial Server is up and running");
    }
}