package com.neu.Assignment2Part8;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/tuitionWavierForm")
public class TuitionForm extends HttpServlet {
    private String message;



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       handleRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request, response);
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        Map m=request.getParameterMap();

        Set s = m.entrySet();

        Iterator it = s.iterator();
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head><title>Using  get Parameter Map</head></title> ");
        out.println("<body>");
        out.println("<ul>");

        while(it.hasNext()){

            Map.Entry<String,String[]> entry = (Map.Entry<String,String[]>)it.next();

            String key = entry.getKey();
            String[] value = entry.getValue();

            out.println("Key is "+key+"<br>");

            if(value.length>1){
                for (int i = 0; i < value.length; i++) {
                    out.println("<li>" + value[i].toString() + "</li><br>");
                }
            }else
                out.println("Value is "+value[0].toString()+"<br>");

            out.println("-------------------<br>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}