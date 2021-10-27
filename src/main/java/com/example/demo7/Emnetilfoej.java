package com.example.demo7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Emnetilføoej", value = "/Emnetilføoej")
public class Emnetilfoej extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {


        HttpSession session = request.getSession();

        List<String> emneListe = (List<String>) session.getAttribute("emneListe");

        if (emneListe == null) {

         emneListe = new ArrayList<>();
         session.setAttribute("emneListe",emneListe);

        }

        String emne = request.getParameter("emne");

        emneListe.add(emne);


        request.getRequestDispatcher("WEB-INF/BrugerSide.jsp").forward(request,response);

//        String a = (String)session.getAttribute("navn");
//
//        log("a er lig " + a);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
