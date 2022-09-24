package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author William Lau
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setAttribute("arithmeticM", "---");
        
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("arithmetic");
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
      
        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("arithmeticM", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        } else {
            try{
                int firstN = Integer.parseInt(first);
                int secondN = Integer.parseInt(second);
                
                switch(operation) {
                    case "+":
                        request.setAttribute("arithmeticM", firstN + secondN);
                        break;
                    
                    case "-":
                        request.setAttribute("arithmeticM", firstN - secondN);
                        break;
                        
                    case "*":
                        request.setAttribute("arithmeticM", firstN * secondN);
                        break;
                        
                    case "%":
                        request.setAttribute("arithmeticM", firstN % secondN);
                        break;
                }
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
                
            } catch (NumberFormatException exception) {
                request.setAttribute("arithmeticM", "invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
        }
        
    
    }

    

}
