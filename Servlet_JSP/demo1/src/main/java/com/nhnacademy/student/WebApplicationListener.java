package com.nhnacademy.student;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class WebApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce){
        ServletContext context = sce.getServletContext();
        StudentRepository studentRepository = new MapStudentRepository();

        List<Student> studentList = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            int age = (int)(Math.random() * 11) + 20;
            Student student = new Student();
            student.setId(String.valueOf(i));
            student.setName("Student " + i);
            student.setGender(Math.random() < 0.5 ? Gender.Male : Gender.Female);  // 랜덤으로 성별 설정
            student.setAge(age);

          //  studentList.add(new Student(student.getId(), student.getName(), student.getGender(), student.getAge()));

            studentRepository.save(student);
            studentList.add(student);

        }
        context.setAttribute("studentRepository", studentRepository);
        context.setAttribute("studentList", studentList);


    }
}
