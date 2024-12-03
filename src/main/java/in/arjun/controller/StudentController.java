package in.arjun.controller;

import in.arjun.entity.Student;
import in.arjun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @QueryMapping
    public List<Student> getAllStudents(){
       return studentService.getAllStudents();
    }
}
