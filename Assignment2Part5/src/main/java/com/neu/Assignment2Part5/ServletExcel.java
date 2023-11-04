package com.neu.Assignment2Part5;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Iterator;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *
 * @author Pratik Hariya
 */

@WebServlet(name = "helloServlet", value = "/Excel.xls")
public class ServletExcel extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        handleRequest(request,response);
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{

        response.setContentType("text/html");

        String name = request.getParameter("fileName");
        String path = request.getRealPath("/resource/") + name;
        FileInputStream fis = new FileInputStream(new File(path));
        HSSFWorkbook hw = new HSSFWorkbook(fis);
        HSSFSheet hs = hw.getSheetAt(0);
        Iterator<Row>  iterator = hs.iterator();

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE HTML><html><head><title>Displaying Data</title></head>");
        out.println("<body>");
        out.println("<table>");

        while(iterator.hasNext()){

            Row row = iterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            out.println("<tr>");

            while(cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                switch(cell.getCellType()){
                    case STRING:
                        out.print("<td>" + cell.getStringCellValue() + "</td>");
                        break;

                    case NUMERIC:
                        out.print("<td>" + cell.getNumericCellValue() + "</td>");
                        break;
                }
            }
            out.println("</tr>");
        }
        out.println("</table></body></html>");

        hw.close();
        fis.close();
    }

    public void destroy() {
    }
}