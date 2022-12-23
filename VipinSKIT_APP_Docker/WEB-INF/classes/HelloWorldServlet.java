import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HelloWorldServlet extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
       String name=req.getParameter("un");
       PrintWriter pw=res.getWriter();
       pw.println("Hello from "+name);
       pw.close();
    }

}