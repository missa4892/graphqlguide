package com.graphqlguide.repo;

import com.graphqlguide.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TeacherRepository {

    private Map<String, Teacher> teachers;

    public TeacherRepository(Map<String, Teacher> teachers) {
        this.teachers = new HashMap<>();
    }

    public Teacher find(String id){
        return teachers.get(id);
    }

}
