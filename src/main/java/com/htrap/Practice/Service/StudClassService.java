package com.htrap.Practice.Service;

import com.htrap.Practice.Model.StudClass;
import com.htrap.Practice.Model.StudentMast;
import com.htrap.Practice.Repository.StudClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudClassService {
    @Autowired
    StudClassRepository studRepo;
    public List<StudClass> addAllStudents(StudClass[] sm){
        for (StudClass s:
                sm) {
            studRepo.save(s);
        }
        return List.of(sm);
    }

    public List<StudClass> readAllStudents(){
        return studRepo.findAll();
    }

    public StudClass updateStudent(Integer id,StudClass sm){
        StudClass sm1 = studRepo.findById(id).get();
        sm1.setClassName(sm.getClassName());
        studRepo.save(sm1);
        return sm1;
    }

    public String deleteStudent(Integer id){
        studRepo.deleteById(id);
        return "Deleted Student";
    }
}
