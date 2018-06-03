package fr.wildcodeschool.mavenproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MyFirstservlet", urlPatterns = "/first-servlet")
public class MyFirstservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<TestModel> testlist = new ArrayList<TestModel>();

        testlist.add(new TestModel("test model 1"));
        testlist.add(new TestModel("test model 2"));
        testlist.add(new TestModel("test model 3"));
        testlist.add(new TestModel("test model 4"));



            request.setAttribute("testlistValue",testlist);
            this.getServletContext().getRequestDispatcher("/testlist.jsp").forward(request, response);
    }
}
