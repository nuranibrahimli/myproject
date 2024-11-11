package com.myproject.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserAnswerRequestDTO {

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Exam ID cannot be null")
    private Long examId;

    @NotNull(message = "Question ID cannot be null")
    private Long questionId;

    @NotBlank(message = "User answer cannot be blank")
    private String userAnswer;

    public UserAnswerRequestDTO() {
    }

    public UserAnswerRequestDTO(Long userId, Long examId, Long questionId, String userAnswer) {
        this.userId = userId;
        this.examId = examId;
        this.questionId = questionId;
        this.userAnswer = userAnswer;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
}
