package com.myproject.demo.dto;

import com.myproject.demo.model.enums.QuestionType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class QuestionRequestDTO {

    @NotNull(message = "Exam ID cannot be null")
    private Long examId;

    @NotNull(message = "Question type cannot be null")
    private QuestionType questionType;

    @NotBlank(message = "Question text cannot be blank")
    private String questionText;

    @NotBlank(message = "Correct answer cannot be blank")
    private String correctAnswer;

    @NotBlank(message = "Options cannot be blank")
    private String options;

    private String audioUrl;

    public QuestionRequestDTO() {
    }

    public QuestionRequestDTO(Long examId, QuestionType questionType, String questionText,
            String correctAnswer, String options, String audioUrl) {
        this.examId = examId;
        this.questionType = questionType;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.options = options;
        this.audioUrl = audioUrl;
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

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }
}
