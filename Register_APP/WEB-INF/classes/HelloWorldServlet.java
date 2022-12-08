import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class HelloWorldServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        String username=req.getParameter("un");
        PrintWriter pw=res.getWriter();
        pw.println("Hello from "+username);
        pw.close();
    }
}