package com.myproject.demo.dto.response;

import java.util.List;

import com.myproject.demo.model.enums.QuestionType;

public class QuestionResponseDTO {

    private Long id;
    private Long examId;
    private QuestionType questionType;
    private String questionText;
    private List<String> options;
    private String audioUrl;
    private Integer timeRemaining;

    public QuestionResponseDTO() {
    }

    public QuestionResponseDTO(Long id, Long examId, QuestionType questionType,
            String questionText, List<String> options,
            String audioUrl, Integer timeRemaining) {
        this.id = id;
        this.examId = examId;
        this.questionType = questionType;
        this.questionText = questionText;
        this.options = options;
        this.audioUrl = audioUrl;
        this.timeRemaining = timeRemaining;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public Integer getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(Integer timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
}
