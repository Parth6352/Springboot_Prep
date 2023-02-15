package com.htrap.Practice.Controller;

import com.htrap.Practice.Model.StudentMast;
import com.htrap.Practice.Service.StudentMastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/jpa")
public class StudentMastController {

    @Autowired
    StudentMastService sms;

    @PostMapping("/addStud")
    public List<StudentMast> addStudent(@RequestBody StudentMast[] sm){
        return sms.addAllStudents(sm);
    }

    @GetMapping("/readStud")
    public List<StudentMast> readStudent(){
        return sms.readAllStudents();
    }

    @PutMapping("/updateStud")
    public StudentMast updateStud(@RequestParam("id") Integer id,@RequestBody StudentMast sm){
        return sms.updateStudent(id,sm);
    }

    @DeleteMapping("/deleteStud")
    public String deleteStud(@PathParam("id") Integer id){
        return sms.deleteStudent(id);
    }
}
