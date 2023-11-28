package com.nhnacademy.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapStudentRepository implements StudentRepository{
    private Map<String, Student> studentList = new ConcurrentHashMap<>();

    public Map<String, Student> getStudentList() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.put(student.getId(), student);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(studentList.values());
    }

    @Override
    public boolean existById(String id) {
        return false;
    }
}
