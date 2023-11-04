package com.example.Assignment2Part4;

import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/readingCSV")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Reading CSV Files";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String fileName = request.getParameter("fileName");
        String path = request.getRealPath("/documents");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Reading CSV Files</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<table>");

        try{
            Class.forName("org.relique.jdbc.csv.CsvDriver");

            Connection c = DriverManager.getConnection("jdbc:relique:csv:" + path);

            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from "+ fileName );

            ResultSetMetaData data = rs.getMetaData();

            int noOfColumns = data.getColumnCount();
            out.println("<tr>");

            for(int i=1; i<=noOfColumns; i++) {
                System.out.println("Printing Heading of table");
                out.println("<th>"+data.getColumnName(i)+"</th>");
            }
            out.println("</tr>");
            while(rs.next()) {
                out.println("<tr>");
                for(int i=1; i<=noOfColumns; i++) {
                    System.out.println("Printing Data of table");
                    out.println("<td>"+rs.getString(i)+"</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
            rs.close();
            s.close();
            c.close();
        } catch(Exception  e) {
            e.printStackTrace();
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}