package com.nhnacademy.student;

import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebServlet(name = "studentRegisterServlet", urlPatterns = "/register")
public class StudentRegisterServlet extends HttpServlet {
    private StudentRepository studentRepository;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        studentRepository = (StudentRepository) servletConfig.getServletContext().getAttribute("studentRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
        rd.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String studentId = req.getParameter("id");
        String studentName = req.getParameter("name");
        Gender gender = Gender.valueOf(String.valueOf(req.getParameter("gender")));
        int age = Integer.parseInt(req.getParameter("age"));

        Student newStudent = new Student(studentId, studentName, gender, age);

        // 등록된 학생 목록 가져옴
        studentRepository = (StudentRepository) req.getServletContext().getAttribute("studentRepository");

        // 새로운 학생 정보 저장
        studentRepository.save(newStudent);

        // 목록을 다시 불러와서 새로 업데이트
        // List<Student> updatedList = studentRepository.getStudents();

        // request에 업데이트된 목록 저장
       // req.setAttribute("studentList", updatedList);
        resp.sendRedirect("/list");

    }
}