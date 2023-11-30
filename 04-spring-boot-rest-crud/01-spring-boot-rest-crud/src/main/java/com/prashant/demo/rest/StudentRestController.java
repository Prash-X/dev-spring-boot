package com.prashant.demo.rest;

import com.prashant.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    private List<Student> theStudents;
    //define @PostConstruct to load the student data....only once!!

    @PostConstruct
    public void loadData()
    {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Prashant","Gidnavar"));
        theStudents.add(new Student("Golu","Gidnavar"));
        theStudents.add(new Student("Raj","Gidnavar"));
    }
    //define endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents()
    {

        return theStudents;
    }

    //define endpoint or "/students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        //just index into the list...keep it simple for now
        //check the studentId against list size

        if((studentId >= theStudents.size()) || (studentId<0))
        {
            //Updating REST service to throw exception if student not found
            throw new StudentNotFoundException("Student id not found - "+ studentId);
        }
        return theStudents.get(studentId);
    }


}
