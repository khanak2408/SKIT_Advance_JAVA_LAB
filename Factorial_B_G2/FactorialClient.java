import java.rmi.*;
public class FactorialClient{
    public static void main(String args[]) throws Exception{
        FactorialInterface ob=null;
        ob=(FactorialInterface)Naming.lookup("//localhost:1091/praveen");
        System.out.println("Factorial of a given number is:"+ob.calculateFactorial(5));
    }
}