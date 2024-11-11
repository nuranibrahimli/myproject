package com.myproject.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.demo.dto.response.QuestionResponseDTO;
import com.myproject.demo.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuestionResponseDTO> getQuestionById(@PathVariable Long id) {
        return ResponseEntity.ok(questionService.getQuestionById(id));
    }

    @GetMapping("/exam/{examId}")
    public ResponseEntity<List<QuestionResponseDTO>> getQuestionsByExamId(@PathVariable Long examId) {
        return ResponseEntity.ok(questionService.getQuestionsByExamId(examId));
    }

    @GetMapping("/next")
    public ResponseEntity<QuestionResponseDTO> getNextQuestion(@RequestParam Long examId,
            @RequestParam Long currentQuestionId) {
        return ResponseEntity.ok(questionService.getNextQuestion(examId, currentQuestionId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return ResponseEntity.ok().build();
    }
}
