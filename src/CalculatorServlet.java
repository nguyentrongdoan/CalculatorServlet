import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Calculator", urlPatterns = "/calculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            String description = request.getParameter("description");
            float price = Float.parseFloat(request.getParameter("price"));
            int discount_percent = Integer.parseInt(request.getParameter("discount"));
            float discount = (float)(price*discount_percent*0.01);
            float total = price - discount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + description);
        writer.println("<h1>Product Price: " + price + "USD");
        writer.println("<h1>Product Discount_Percent: " + discount_percent + "%");
        writer.println("<h1>Product Discount: " + discount + "USD");
        writer.println("<h1>Product Total: " + total + "USD");
        writer.println("</html");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
