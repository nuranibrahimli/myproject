package com.myproject.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.demo.dto.response.ExamResultResponseDTO;
import com.myproject.demo.service.ExamResultService;

@RestController
@RequestMapping("/api/results")
public class ExamResultController {

    private final ExamResultService examResultService;

    public ExamResultController(ExamResultService examResultService) {
        this.examResultService = examResultService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<ExamResultResponseDTO> calculateExamResult(@RequestParam Long userId,
            @RequestParam Long examId) {
        return ResponseEntity.ok(examResultService.calculateExamResult(userId, examId));
    }

    @GetMapping
    public ResponseEntity<ExamResultResponseDTO> getExamResult(@RequestParam Long userId,
            @RequestParam Long examId) {
        return ResponseEntity.ok(examResultService.getExamResult(userId, examId));
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveExamResult(@RequestParam Long userId,
            @RequestParam Long examId,
            @RequestBody ExamResultResponseDTO result) {
        examResultService.saveExamResult(userId, examId, result);
        return ResponseEntity.ok().build();
    }
}
