import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterServlet() 
    {
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		String location = request.getParameter("location");
		String email = request.getParameter("email");
		String password = request.getParameter("password");		
		RegistrationBean rb = new RegistrationBean();
		rb.setName(name);
		rb.setId(id);
		rb.setLocation(location);
		rb.setEmail(email);
		rb.setPassword(password);		
		DAO dao = new DAO();
		PrintWriter pw = response.getWriter();
		pw.print("Welcome  "+ name);	
	}
}