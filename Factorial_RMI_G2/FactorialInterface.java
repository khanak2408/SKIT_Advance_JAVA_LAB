//Step :1 Create a Remote Interface
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface FactorialInterface extends Remote{
    public int calculateFactorial(int n) throws RemoteException;
}