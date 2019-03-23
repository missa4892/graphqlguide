package resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;

import model.Teacher;
import repo.TeacherRepository;

public class SchoolQuery implements GraphQLQueryResolver {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher teacher(String id){
        return teacherRepository.find(id);
    }

}
