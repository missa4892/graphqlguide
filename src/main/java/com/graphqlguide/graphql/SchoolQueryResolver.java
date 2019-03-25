package com.graphqlguide.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.graphqlguide.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import com.graphqlguide.repo.TeacherRepository;

@Component
public class SchoolQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher teacher(String id){
        return teacherRepository.find(id);
    }

}
