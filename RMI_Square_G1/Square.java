import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
public class Square extends UnicastRemoteObject implements SquareInterface{
    public Square() throws Exception{

    }
    public int calculateSquare(int n){
        int result;
        result=n*n;
        return result;
    }
}