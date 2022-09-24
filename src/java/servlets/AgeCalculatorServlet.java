package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author William Lau
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        if (age == null || age.equals("")){
            String ageM = "You must give your current age.";
            request.setAttribute("ageM", ageM);
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        } else {
            try { 
                int ageO = Integer.parseInt(age);
                int ageAdd = ageO + 1;
                request.setAttribute("ageM", "Your age next birthday will be " + ageAdd);
                 getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
            } catch (NumberFormatException exception) {
                request.setAttribute("ageM", "You must enter a number.");
                 getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                }
            }
        
     }
            


}
