package com.myproject.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.demo.dto.response.UserAnswerResponseDTO;
import com.myproject.demo.service.UserAnswerService;

@RestController
@RequestMapping("/api/answers")
public class UserAnswerController {

    private final UserAnswerService userAnswerService;

    public UserAnswerController(UserAnswerService userAnswerService) {
        this.userAnswerService = userAnswerService;
    }

    @PostMapping
    public ResponseEntity<UserAnswerResponseDTO> saveUserAnswer(@RequestParam Long userId,
            @RequestParam Long questionId,
            @RequestParam String answer) {
        return ResponseEntity.ok(userAnswerService.saveUserAnswer(userId, questionId, answer));
    }

    @GetMapping("/exam")
    public ResponseEntity<List<UserAnswerResponseDTO>> getUserAnswersByExamId(@RequestParam Long userId,
            @RequestParam Long examId) {
        return ResponseEntity.ok(userAnswerService.getUserAnswersByExamId(userId, examId));
    }

    @GetMapping("/question")
    public ResponseEntity<UserAnswerResponseDTO> getUserAnswerByQuestionId(@RequestParam Long userId,
            @RequestParam Long questionId) {
        return ResponseEntity.ok(userAnswerService.getUserAnswerByQuestionId(userId, questionId));
    }
}
