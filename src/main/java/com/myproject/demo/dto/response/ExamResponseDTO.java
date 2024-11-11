package com.myproject.demo.dto.response;

import com.myproject.demo.model.enums.ExamType;

public class ExamResponseDTO {

    private Long id;
    private ExamType examType;
    private String title;
    private String description;
    private Integer totalQuestions;
    private Integer timePerQuestion;
    private Integer completionPercentage;
    private String status;
    private Long participantCount;

    public ExamResponseDTO() {
    }

    public ExamResponseDTO(Long id, ExamType examType, String title, String description,
            Integer totalQuestions, Integer timePerQuestion,
            Integer completionPercentage, String status, Long participantCount) {
        this.id = id;
        this.examType = examType;
        this.title = title;
        this.description = description;
        this.totalQuestions = totalQuestions;
        this.timePerQuestion = timePerQuestion;
        this.completionPercentage = completionPercentage;
        this.status = status;
        this.participantCount = participantCount;
    }

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

    public Integer getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(Integer completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Long participantCount) {
        this.participantCount = participantCount;
    }
}
