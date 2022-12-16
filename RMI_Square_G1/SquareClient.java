import java.rmi.*;
public class SquareClient{
    public static void main(String args[]) throws Exception{
        SquareInterface h=null;
        h=(SquareInterface)Naming.lookup("//localhost:1091/praveen");
        System.out.println("Square of a given number is:"+h.calculateSquare(5));
    }
}