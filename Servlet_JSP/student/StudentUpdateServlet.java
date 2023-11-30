package com.nhnacademy.student;

import java.io.IOException;
import java.util.Objects;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "studentUpdateServlet", urlPatterns = "/update")
public class StudentUpdateServlet extends HttpServlet {
    private StudentRepository studentRepository;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        studentRepository = (StudentRepository) servletConfig.getServletContext().getAttribute("studentRepository");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String studentId = req.getParameter("id");
        Student student = studentRepository.getStudentById(studentId);

        if(student == null){
            throw new IllegalArgumentException("Invalid Info!");
        }
        else {
            req.setAttribute("student", student);
            RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
            rd.forward(req,resp);
        }

    }

    //    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String id = req.getParameter("id");
//        Student student = studentRepository.getStudentById(id);
//        if(Objects.isNull(student)){
//            throw new RuntimeException("Student not found :" + id);
//        }
//        req.setAttribute("student",student);
//
//
//        RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
//        rd.forward(req,resp);

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentId = req.getParameter("id");
        String studentName = req.getParameter("name");
        Gender gender = Gender.valueOf(String.valueOf(req.getParameter("gender")));
        int age = Integer.parseInt(req.getParameter("age"));


        if(studentId == null || studentName == null || age == 0 || gender == null){
            throw new IllegalArgumentException("id와 이름 정보를 확인해주세요!");
        }else {
            Student student = new Student(studentId, studentName, gender, age);
            studentRepository.update(student);
            resp.sendRedirect("/list");
        }

    }
}
