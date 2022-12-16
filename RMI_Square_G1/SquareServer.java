import java.rmi.registry.LocateRegistry;
import java.rmi.*;
public class SquareServer{
    public static void main(String args[]) throws Exception{
        Square ob=new Square();
        LocateRegistry.createRegistry(1091);
        System.out.println("Registry is created on port 1091");
        Naming.bind("//localhost:1091/praveen",ob);
        System.out.println("Square Server is up and running");

    }
}