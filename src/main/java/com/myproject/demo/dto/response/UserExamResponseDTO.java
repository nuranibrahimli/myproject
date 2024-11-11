package com.myproject.demo.dto.response;

import java.time.LocalDateTime;

public class UserExamResponseDTO {

    private Long id;
    private Long userId;
    private Long examId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double score;
    private String status;
    private Integer correctAnswers;
    private Integer wrongAnswers;
    private Integer totalQuestions;

    public UserExamResponseDTO() {
    }

    public UserExamResponseDTO(Long id, Long userId, Long examId, LocalDateTime startTime,
            LocalDateTime endTime, Double score, String status,
            Integer correctAnswers, Integer wrongAnswers, Integer totalQuestions) {
        this.id = id;
        this.userId = userId;
        this.examId = examId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.score = score;
        this.status = status;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
        this.totalQuestions = totalQuestions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(Integer correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public Integer getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(Integer wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public Integer getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(Integer totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
}
