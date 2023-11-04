package com.neu.Assignment2Part7;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/TuitionForm")
public class TuitionForm extends HttpServlet {
    private String message;



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       handleRequest(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request,response);
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        Enumeration en = request.getParameterNames();
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head><title> My Tuition Wavier Form</title></head>");
        out.println("<body>");
        out.println("<ul>");

        while(en.hasMoreElements()){
            Object objOri=en.nextElement();

            String param=(String)objOri;
            String value=request.getParameter(param);
            out.println("<li>");
            out.println("Parameter Name is '"+param+"' and Parameter Value is '"+value+"'");
            out.println("</li>");
        }
        out.println("/<ul>");
        out.println("</body>");
        out.println("</html>");
    }
    public void destroy() {
    }
}