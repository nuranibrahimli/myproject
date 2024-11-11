package com.myproject.demo.dto.response;

public class UserAnswerResponseDTO {

    private Long id;
    private Long questionId;
    private String userAnswer;
    private String correctAnswer;
    private Boolean isCorrect;
    private Integer timeTaken;

    public UserAnswerResponseDTO() {
    }

    public UserAnswerResponseDTO(Long id, Long questionId, String userAnswer,
            String correctAnswer, Boolean isCorrect, Integer timeTaken) {
        this.id = id;
        this.questionId = questionId;
        this.userAnswer = userAnswer;
        this.correctAnswer = correctAnswer;
        this.isCorrect = isCorrect;
        this.timeTaken = timeTaken;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Integer getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Integer timeTaken) {
        this.timeTaken = timeTaken;
    }
}
