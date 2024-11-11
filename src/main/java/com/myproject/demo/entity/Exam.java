package com.myproject.demo.entity;

import com.myproject.demo.model.enums.ExamStatus;
import com.myproject.demo.model.enums.ExamType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExamType examType;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false)
    private Integer totalQuestions;

    @Column(nullable = false)
    private Integer timePerQuestion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExamStatus status = ExamStatus.NOT_STARTED;

    // Default constructor
    public Exam() {
    }

    // All args constructor
    public Exam(Long id, ExamType examType, String title, String description,
            Integer totalQuestions, Integer timePerQuestion, ExamStatus status) {
        this.id = id;
        this.examType = examType;
        this.title = title;
        this.description = description;
        this.totalQuestions = totalQuestions;
        this.timePerQuestion = timePerQuestion;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(Integer totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public Integer getTimePerQuestion() {
        return timePerQuestion;
    }

    public void setTimePerQuestion(Integer timePerQuestion) {
        this.timePerQuestion = timePerQuestion;
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
        return "Exam{"
                + "id=" + id
                + ", examType=" + examType
                + ", title='" + title + '\''
                + ", description='" + description + '\''
                + ", totalQuestions=" + totalQuestions
                + ", timePerQuestion=" + timePerQuestion
                + ", status=" + status
                + '}';
    }
}
