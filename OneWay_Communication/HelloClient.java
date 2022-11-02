import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient 
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",777);
		InputStream is=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String msgFromServer=br.readLine();
		System.out.println("Message from server is:"+msgFromServer);
		
		br.close();
		is.close();
		s.close();
	}

}
