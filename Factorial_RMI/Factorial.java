import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class Factorial extends UnicastRemoteObject implements FactorialInterface{
    public Factorial() throws Exception{

    }
    public int calculateFactorial(int p){
        if(p==1 || p==0)
            return 1;
        else
            return p*calculateFactorial(p-1);
    }
}