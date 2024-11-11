package com.myproject.demo.dto;

import com.myproject.demo.model.enums.ExamType;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExamRequestDTO {

    @NotNull(message = "Exam type cannot be null")
    private ExamType examType;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    private String description;

    @NotNull(message = "Total questions cannot be null")
    @Min(value = 1, message = "Total questions must be at least 1")
    private Integer totalQuestions;

    @NotNull(message = "Time per question cannot be null")
    @Min(value = 30, message = "Time per question must be at least 30 seconds")
    private Integer timePerQuestion;

    public ExamRequestDTO() {
    }

    public ExamRequestDTO(ExamType examType, String title, String description,
            Integer totalQuestions, Integer timePerQuestion) {
        this.examType = examType;
        this.title = title;
        this.description = description;
        this.totalQuestions = totalQuestions;
        this.timePerQuestion = timePerQuestion;
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
}
