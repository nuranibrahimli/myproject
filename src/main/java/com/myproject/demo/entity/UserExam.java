package com.myproject.demo.entity;

import java.time.LocalDateTime;

import com.myproject.demo.model.enums.ExamStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_exams")
public class UserExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "exam_id", nullable = false)
    private Long examId;

    @Column(nullable = false)
    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Integer score;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExamStatus status = ExamStatus.NOT_STARTED;

    // Default constructor
    public UserExam() {
    }

    // All args constructor
    public UserExam(Long id, Long userId, Long examId, LocalDateTime startTime,
            LocalDateTime endTime, Integer score, ExamStatus status) {
        this.id = id;
        this.userId = userId;
        this.examId = examId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.score = score;
        this.status = status;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public ExamStatus getStatus() {
        return status;
    }

    public void setStatus(ExamStatus status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return "UserExam{"
                + "id=" + id
                + ", userId=" + userId
                + ", examId=" + examId
                + ", startTime=" + startTime
                + ", endTime=" + endTime
                + ", score=" + score
                + ", status=" + status
                + '}';
    }
}
