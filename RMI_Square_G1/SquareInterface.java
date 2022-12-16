import java.rmi.Remote;
import java.rmi.RemoteException;
public interface SquareInterface extends Remote{
    public int calculateSquare(int n) throws RemoteException;
}