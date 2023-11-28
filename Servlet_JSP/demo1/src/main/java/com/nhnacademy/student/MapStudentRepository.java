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
        if(existById(student.getId())) {
            studentList.put(student.getId(), student);
        }else {
            throw new IllegalArgumentException(student.getId() + "가 존재하지 않습니다.");
        }

    }

    @Override
    public void deleteById(String id) {
        studentList.remove(id);
    }

    @Override
    public Student getStudentById(String id) {
        return studentList.get(id);
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(studentList.values());
    }

    @Override
    public boolean existById(String id) {
        return studentList.containsKey(id);
    }
}
