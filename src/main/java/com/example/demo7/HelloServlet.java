package com.example.demo7;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet
{
    private String message;

    public void init()
    {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");

        log(pass1 + " " + pass2);

        PrintWriter out = response.getWriter();


        if (pass1.equals(pass2)) {

//            response.setContentType("text/html");
//            out.println("<html><body>");
//            out.println("<h1>" + "welkommen de på password var ens" + "</h1>");
//            out.println("</body></html>");
//            response.setContentType("text/html");
            HttpSession session = request.getSession();



            String navn = request.getParameter("name");
//            log("navnet er " + navn);
//            request.setAttribute("navn", navn);

            session.setAttribute("navn", navn);
            request.getRequestDispatcher("WEB-INF/BrugerSide.jsp").forward(request,response);


        }


    else {

        request.setAttribute("msg","de to passwords var ikke ens !");

        request.getRequestDispatcher("index.jsp").forward(request,response);



        }


    }

    public void destroy()
    {
    }
}