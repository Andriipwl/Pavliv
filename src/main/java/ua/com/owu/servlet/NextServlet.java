package ua.com.owu.servlet;

import ua.com.owu.connect.DbConnect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "NextServlet")
public class NextServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        DbConnect dbConnect = new DbConnect();
        request.setAttribute("users", dbConnect.select());
        request.getRequestDispatcher("/WEB-INF/pages/allUsers.jsp").forward(request, response);

    }
}
