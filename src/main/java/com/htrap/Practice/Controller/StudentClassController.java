package com.htrap.Practice.Controller;

import com.htrap.Practice.Model.StudClass;
import com.htrap.Practice.Service.StudClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentClassController {
    @Autowired
    StudClassService studClassService;

    @PostMapping("/getAllStud")
    public List<StudClass> addData(@RequestBody StudClass[] s){
        return studClassService.addAllStudents(s);
    }
}
