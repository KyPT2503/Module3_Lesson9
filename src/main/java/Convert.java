import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "index", urlPatterns = "/convert")
public class Convert extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int amount=Integer.parseInt(request.getParameter("amount"));
            int rate=Integer.parseInt(request.getParameter("rate"));
            PrintWriter writer=response.getWriter();
            writer.println("<html>"+amount*rate+"</html>");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
