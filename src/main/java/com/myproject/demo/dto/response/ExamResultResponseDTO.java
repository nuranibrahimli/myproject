package com.myproject.demo.dto.response;

import java.util.List;

public class ExamResultResponseDTO {

    private Long examId;
    private Double totalScore;
    private Integer correctAnswers;
    private Integer wrongAnswers;
    private Integer timeTaken;
    private Integer earnedXP;
    private List<UserAnswerResponseDTO> detailedAnswers;

    public ExamResultResponseDTO() {
    }

    public ExamResultResponseDTO(Long examId, Double totalScore, Integer correctAnswers,
            Integer wrongAnswers, Integer timeTaken, Integer earnedXP,
            List<UserAnswerResponseDTO> detailedAnswers) {
        this.examId = examId;
        this.totalScore = totalScore;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
        this.timeTaken = timeTaken;
        this.earnedXP = earnedXP;
        this.detailedAnswers = detailedAnswers;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
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

    public Integer getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Integer timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Integer getEarnedXP() {
        return earnedXP;
    }

    public void setEarnedXP(Integer earnedXP) {
        this.earnedXP = earnedXP;
    }

    public List<UserAnswerResponseDTO> getDetailedAnswers() {
        return detailedAnswers;
    }

    public void setDetailedAnswers(List<UserAnswerResponseDTO> detailedAnswers) {
        this.detailedAnswers = detailedAnswers;
    }
}
