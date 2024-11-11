package com.myproject.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_answers")
public class UserAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "exam_id", nullable = false)
    private Long examId;

    @Column(name = "question_id", nullable = false)
    private Long questionId;

    @Column(nullable = false)
    private String userAnswer;

    @Column(nullable = false)
    private Boolean isCorrect;

    @Column(nullable = false)
    private LocalDateTime answeredTime;

    // Default constructor
    public UserAnswer() {
    }

    // All args constructor
    public UserAnswer(Long id, Long userId, Long examId, Long questionId,
            String userAnswer, Boolean isCorrect, LocalDateTime answeredTime) {
        this.id = id;
        this.userId = userId;
        this.examId = examId;
        this.questionId = questionId;
        this.userAnswer = userAnswer;
        this.isCorrect = isCorrect;
        this.answeredTime = answeredTime;
    }

    // Getters and Setters
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

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public LocalDateTime getAnsweredTime() {
        return answeredTime;
    }

    public void setAnsweredTime(LocalDateTime answeredTime) {
        this.answeredTime = answeredTime;
    }

    // toString method
    @Override
    public String toString() {
        return "UserAnswer{"
                + "id=" + id
                + ", userId=" + userId
                + ", examId=" + examId
                + ", questionId=" + questionId
                + ", userAnswer='" + userAnswer + '\''
                + ", isCorrect=" + isCorrect
                + ", answeredTime=" + answeredTime
                + '}';
    }
}
