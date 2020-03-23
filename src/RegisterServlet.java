//this servlet allows a new user to be registered using the doGet method
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uEmail = request.getParameter("email");
		String uPass = request.getParameter("password");
		String ufName = request.getParameter("fName");
		String ulName = request.getParameter("lName");
		String uAddress = request.getParameter("address");
		String uCity = request.getParameter("city");
		String uState = request.getParameter("state");
		String uZip = request.getParameter("zip");
		String uQuote = request.getParameter("quote");
		
		UserDAO userDao = new UserDAO();
        
        try {
            User user = userDao.register(uEmail, uPass, ufName, ulName, uAddress, uCity, uState, uZip, uQuote);
            String destPage = "register.jsp";
             
            if (user != null) {           	
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                destPage = "profile.jsp";
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);
             
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
			
		} 		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
