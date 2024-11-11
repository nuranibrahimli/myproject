package com.myproject.demo.entity;

import com.myproject.demo.model.enums.QuestionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exam_id", nullable = false)
    private Long examId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private QuestionType questionType;

    @Column(nullable = false, length = 1000)
    private String questionText;

    @Column(nullable = false)
    private String correctAnswer;

    @Column(nullable = false)
    private String options;

    private String audioUrl;

    // Default constructor
    public Question() {
    }

    // All args constructor
    public Question(Long id, Long examId, QuestionType questionType, String questionText,
            String correctAnswer, String options, String audioUrl) {
        this.id = id;
        this.examId = examId;
        this.questionType = questionType;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.options = options;
        this.audioUrl = audioUrl;
    }

    // Getters and Setters
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

    // toString method
    @Override
    public String toString() {
        return "Question{"
                + "id=" + id
                + ", examId=" + examId
                + ", questionType=" + questionType
                + ", questionText='" + questionText + '\''
                + ", correctAnswer='" + correctAnswer + '\''
                + ", options='" + options + '\''
                + ", audioUrl='" + audioUrl + '\''
                + '}';
    }
}
