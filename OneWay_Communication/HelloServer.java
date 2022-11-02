import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//Step 1: Create Server using ServerSocket 
		//Class
		ServerSocket ss=new ServerSocket(777);
		System.out.println("Server is waiting for the client");
		Socket s=ss.accept();
		System.out.println("Server is connected to the client");
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);
		String msg="Hello from server";
		ps.println(msg);
		
		ps.close();
		s.close();
		ss.close();
		
	}

}
