package ua.com.owu.servlet;

import ua.com.owu.connect.DbConnect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "IndexServlet")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String username = request.getParameter("username");
        System.out.println(username);
        DbConnect dbConnect = new DbConnect();
        dbConnect.insert(username);
        request.getRequestDispatcher("/WEB-INF/pages/welcome.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("key","Hello, JAVA 9");
        request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);
    }
}
