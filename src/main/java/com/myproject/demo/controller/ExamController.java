package com.myproject.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.demo.dto.response.ExamResponseDTO;
import com.myproject.demo.model.enums.ExamType;
import com.myproject.demo.service.ExamService;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExamResponseDTO> getExamById(@PathVariable Long id) {
        return ResponseEntity.ok(examService.getExamById(id));
    }

    @GetMapping
    public ResponseEntity<List<ExamResponseDTO>> getAllExams() {
        return ResponseEntity.ok(examService.getAllExams());
    }

    @GetMapping("/type/{examType}")
    public ResponseEntity<List<ExamResponseDTO>> getExamsByType(@PathVariable ExamType examType) {
        return ResponseEntity.ok(examService.getExamsByType(examType));
    }

    @GetMapping("/active")
    public ResponseEntity<List<ExamResponseDTO>> getActiveExams() {
        return ResponseEntity.ok(examService.getActiveExams());
    }

    @PostMapping("/{examId}/start")
    public ResponseEntity<ExamResponseDTO> startExam(@PathVariable Long examId,
            @RequestParam Long userId) {
        return ResponseEntity.ok(examService.startExam(examId, userId));
    }

    @PostMapping("/{examId}/finish")
    public ResponseEntity<Void> finishExam(@PathVariable Long examId,
            @RequestParam Long userId) {
        examService.finishExam(examId, userId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExam(@PathVariable Long id) {
        examService.deleteExam(id);
        return ResponseEntity.ok().build();
    }
}
