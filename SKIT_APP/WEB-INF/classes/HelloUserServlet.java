import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HelloUserServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        String username=req.getParameter("un");
        PrintWriter pw=res.getWriter();
        pw.println("Hi from "+username);
    }
}