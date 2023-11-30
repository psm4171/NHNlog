package com.nhnacademy.student;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebServlet(name = "studentViewServlet", urlPatterns = "/view")
public class StudentViewServlet extends HttpServlet {
    private StudentRepository studentRepository;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        studentRepository = (StudentRepository) servletConfig.getServletContext().getAttribute("studentRepository");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            String studentId = req.getParameter("id");
            Student student = studentRepository.getStudentById(studentId);

            if (student == null) {
                throw new IllegalArgumentException("Invalid Student Info! ");
            } else {
                //학생 정보를 Request 속성에 추가
                req.setAttribute("student", student);
            }
            RequestDispatcher rd = req.getRequestDispatcher("/view.jsp");

            rd.forward(req, resp);

        }catch (Exception e){
            log.error("An error occured in doGet", e);
        }
    }
}
