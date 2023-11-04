# web_tools_servlets_with_security_assignment

## Part 1. Reading Assignment (Chapter 48)

https://docs.oracle.com/javaee/7/JEETT.pdfLinks to an external site.

## Part 2. Reading Assignment (Declarative Web Application Security)

http://pdf.moreservlets.com/More-Servlets-and-JSP-Chapter-07.pdf [Site was down - if still down, use the next link] Links to an external site.
https://learning.oreilly.com/library/view/more-servlets-and/0130676144/0130676144_ch07.htmlLinks to an external site.

## Part 3. Reading Assignment (Controlling Web Application Behavior with web.xml)

https://learning.oreilly.com/library/view/more-servlets-and/0130676144/0130676144_ch05.html#ch05Links to an external site.

## Part 4. Programming Assignment

Read the attached [parking_facilities.csv

Download parking_facilities.csv Download parking_facilities.csv] CSV file using CsvJdbc Driver - http://csvjdbc.sourceforge.net (Links to an external site.)Links to an external site.

Web Application’s welcome page initially displays a FORM in a HTML page having a textbox for the user to enter the name of the CSV file. This form will be submitted to a Servlet (you could use either annotations or XML mapping) that will read the name of the file, and connect to the CSV file using CsvJdbc. Once the connection is established, the servlet will get the data from the CSV file, print the data on the browser (you may use an HTML table if you want). When creating a URL-pattern use the extension .xls for the servlet.

## Part 5. Programming Assignment

Read the attached Excel File [store.xls

Download store.xls Download store.xls] using Apache POI - http://poi.apache.org/ (Links to an external site.)Links to an external site.

Create an Annotated Servlet that will read the excel file, and print the contents of the excel file to user’s browser. You may use an HTML table to display the data. Create .xls URL pattern (servlet url pattern will be any name\*.xls, like store.xls) for the Servlet page using Annotations.

Once done, add Declarative Web Application Security [described in part 2.2].

## Part 6. Programming Assignment

Create a WebApplication in Netbeans to read and display user input from the following form you design in HW1-Part4.
Map the servlet in web.xml (Netbeans does this automatically)
Use request.getParameter(“fieldname”).

## Part 7. Programming Assignment

Redo Part 6 using getParameterNames() method.
Map the Servlet using Annotations (Netbeans does this automatically)
Add Declarative Security.
https://docs.oracle.com/javaee/7/api/javax/servlet/ServletRequest.html#getParameterNames-- (Links to an external site.)Links to an external site.

## Part 8. Programming Assignment

Redo Part 7 but use getParameterMap() method.
https://docs.oracle.com/javaee/7/api/javax/servlet/ServletRequest.html#getParameterMap--
