import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class AdditionServer{
    public static void main(String args[]) throws Exception{
        Addition hello=new Addition();
        LocateRegistry.createRegistry(1091);
        System.out.println("Java RMI Registry is created on port 1091");
        Naming.bind("//localhost:1091/hello",hello);
        System.out.println("Addition Server is ready");
    }
}