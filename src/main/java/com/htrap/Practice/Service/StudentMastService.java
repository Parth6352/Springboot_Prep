package com.htrap.Practice.Service;

import com.htrap.Practice.Model.StudentMast;
import com.htrap.Practice.Repository.StudentMastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentMastService {
    @Autowired
    StudentMastRepository studRepo;

    public List<StudentMast> addAllStudents(StudentMast[] sm){
        for (StudentMast s:
             sm) {
            studRepo.save(s);
        }
        return List.of(sm);
    }

    public List<StudentMast> readAllStudents(){
        return studRepo.findAll();
    }

    public StudentMast updateStudent(Integer id,StudentMast sm){
        StudentMast sm1 = studRepo.findById(id).get();
        sm1.setStudentName(sm.getStudentName());
        sm1.setEmail(sm.getEmail());
        sm1.setAge(sm.getAge());
        sm1.setStudClass(sm.getStudClass());
        studRepo.save(sm1);
        return sm1;
    }

    public String deleteStudent(Integer id){
        studRepo.deleteById(id);
        return "Deleted Student";
    }
}
