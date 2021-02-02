import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCounting", urlPatterns = "/count-discount")
public class DiscountCounting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String describe=request.getParameter("describe");
        float price=Float.parseFloat(request.getParameter("price"));
        float percent=Float.parseFloat(request.getParameter("percent"));
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Description</h1>");
        writer.println("<p>"+describe+"</p>");
        writer.println("<h1>Discount Amount: "+price*percent*0.01f+"</h1>");
        writer.println("</html>");
    }
}
