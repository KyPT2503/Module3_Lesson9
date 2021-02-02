import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Dictionary", urlPatterns = "/dictionary")
public class Dictionary extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("user","Nguoi dung");
        dictionary.put("home","Ngoi nha");
        dictionary.put("book","quyen sach");
        dictionary.put("lesson","Bai hoc");
        String search=dictionary.get(request.getParameter("word"));
        PrintWriter writer=response.getWriter();
        if (search==null){
            writer.println("<html>Word not found in dictionary!</html>");
        } else {
            writer.println("<html>"+search+"</html>");
        }
    }
}
