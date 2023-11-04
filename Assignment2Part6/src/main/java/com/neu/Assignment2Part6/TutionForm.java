package com.neu.Assignment2Part6;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/TuitionForm")
public class TutionForm extends HttpServlet {
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
        String academic_term = request.getParameter("academic_term");
        String academic_year = request.getParameter("academic_year");
        String emp_status = request.getParameter("emp_status");
        String Other = request.getParameter("Other");


        String Student_name = request.getParameter("Student_name");
        String relation_to_employee = request.getParameter("relation_to_employee");
        String nuid = request.getParameter("nuid");
        String different_emp_name = request.getParameter("different_emp_name");
        String empy_nuid = request.getParameter("empy_nuid");
        String department = request.getParameter("department");
        String campus_location = request.getParameter("campus_location");
        String phone_number = request.getParameter("phone_number");
        String supervisor_name = request.getParameter("supervisor_name");

        String undergrad_program = request.getParameter("undergrad_program");
        String law_school = request.getParameter("law_school");
        String doctoral = request.getParameter("doctoral");
        String cps_grad = request.getParameter("cps_grad");
        String cps_undergrade = request.getParameter("cps_undergrade");
        String graduate_school = request.getParameter("graduate_school");
        String courseNo1 = request.getParameter("courseNo1");
        String courseNo2 = request.getParameter("courseNo2");
        String courseNo3 = request.getParameter("courseNo3");
        String courseName1 = request.getParameter("courseName1");
        String courseName2 = request.getParameter("courseName2");
        String courseName3 = request.getParameter("courseName3");
        String supervisor_signature1 = request.getParameter("supervisor_signature1");
        String supervisor_signature2 = request.getParameter("supervisor_signature2");
        String supervisor_signature3 = request.getParameter("supervisor_signature3");
        String credit_hrs1 = request.getParameter("credit_hrs1");
        String credit_hrs2 = request.getParameter("credit_hrs2");
        String credit_hrs3 = request.getParameter("credit_hrs3");
        String day1 = request.getParameter("day1");
        String day2 = request.getParameter("day2");
        String day3 = request.getParameter("day3");
        String time1 = request.getParameter("time1");
        String time2 = request.getParameter("time2");
        String time3 = request.getParameter("time3");

        String employee_sign = request.getParameter("employee_sign");
        String date = request.getParameter("date");
        String hrm_sign = request.getParameter("employee_sign");
        String date1 = request.getParameter("date1");







        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head><title> My Tuition Wavier Form</title></head>");
        out.println("<body>");

        out.println("<h6>Academic term:</h6>" + academic_term);
        out.println("<h6> Academic Year:</h6>" + academic_year);
        out.println("<h6>Emp status:</h6>" + emp_status);
        out.println("<h6>Other:</h6>" + Other);
        out.println("<h6>Student name:</h6>" + Student_name);
        out.println("<h6>relation_to_employee:</h6>" + relation_to_employee);
        out.println("<h6>nuid:</h6>" + nuid);
        out.println("<h6>different_emp_name:</h6>" + different_emp_name);
        out.println("<h6>empy_nuid:</h6>" + empy_nuid);
        out.println("<h6>department:</h6>" + department);
        out.println("<h6>campus_location:</h6>" + campus_location);
        out.println("<h6>phone_number:</h6>" + phone_number);
        out.println("<h6>supervisor_name:</h6>" + supervisor_name);
        out.println("<h6>undergrad_program:</h6>" + undergrad_program);
        out.println("<h6>law_school:</h6>" + law_school);
        out.println("<h6>doctoral:</h6>" + doctoral);
        out.println("<h6>cps_grad:</h6>" + cps_grad);
        out.println("<h6>cps_undergrade:</h6>" + cps_undergrade);
        out.println("<h6>graduate_school:</h6>" + graduate_school);
        out.println("<h6>courseNo1:</h6>" + courseNo1);
        out.println("<h6>courseName1:</h6>" + courseName1);
        out.println("<h6>supervisor_signature1:</h6>" + supervisor_signature1);
        out.println("<h6>credit_hrs1:</h6>" + credit_hrs1);
        out.println("<h6>day1:</h6>" + day1);
        out.println("<h6>time1:</h6>" + time1);
        out.println("<h6>courseNo2:</h6>" + courseNo2);
        out.println("<h6>courseName2:</h6>" + courseName2);
        out.println("<h6>supervisor_signature2:</h6>" + supervisor_signature2);
        out.println("<h6>credit_hrs2:</h6>" + credit_hrs2);
        out.println("<h6>day2:</h6>" + day2);
        out.println("<h6>time2:</h6>" + time2);
        out.println("<h6>courseNo3:</h6>" + courseNo3);


        out.println("<h6>courseName3:</h6>" + courseName3);


        out.println("<h6>supervisor_signature3:</h6>" + supervisor_signature3);



        out.println("<h6>credit_hrs3:</h6>" + credit_hrs3);


        out.println("<h6>day3:</h6>" + day3);


        out.println("<h6>time3:</h6>" + time3);
        out.println("<h6>employee_sign:</h6>" + employee_sign);
        out.println("<h6>date:</h6>" + date);
        out.println("<h6>employee_sign:</h6>" + employee_sign);
        out.println("<h6>date:</h6>" + date1);

        out.println("</body></html>");
    }
    public void destroy() {
    }
}