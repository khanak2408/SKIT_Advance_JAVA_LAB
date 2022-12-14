//Step :2 Create a Implementation class and Inherit that class with UnicastRemoteObject
// so that its method can be called at remotely.
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class Factorial extends UnicastRemoteObject implements FactorialInterface{
    public Factorial() throws Exception{
    }

    public int calculateFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else
            return n*calculateFactorial(n-1);
    }
}