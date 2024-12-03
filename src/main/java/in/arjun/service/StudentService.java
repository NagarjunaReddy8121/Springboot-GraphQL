package in.arjun.service;

import in.arjun.entity.Student;
import in.arjun.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
       return studentRepository.findAll();
    }
}
