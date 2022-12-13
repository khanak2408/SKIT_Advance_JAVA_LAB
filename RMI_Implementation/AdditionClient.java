import java.rmi.*;
public class AdditionClient{
    public static void main(String args[]) throws Exception{
        AdditionInterface hello=null;
        hello=(AdditionInterface)Naming.lookup("//localhost:1091/hello");
        System.out.println("Sum of two number is:"+hello.add(3,4));
    }
}