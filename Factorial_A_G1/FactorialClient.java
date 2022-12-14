import java.rmi.*;
public class FactorialClient{
    public static void main(String args[]) throws Exception{
        FactorialInterface h=null;
        h=(FactorialInterface)Naming.lookup("//localhost:1091/praveen");
        System.out.println("Factorial of a given number is:"+h.calculateFactorial(5));
    }
}