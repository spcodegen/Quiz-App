package edu.icet.controller;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {
    //http://localhost:8080/exam/create-exam

    final ExamService service;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
        service.createExam(exam);
    }

    @GetMapping("/get-exam-by-course-id/{id}")
    public Exam getExamByCourseId(@PathVariable Integer id){
        return service.getExamByCourseId(id);
    }
}
