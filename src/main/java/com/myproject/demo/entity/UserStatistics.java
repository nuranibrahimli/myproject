package com.myproject.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class UserStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Integer totalExams;
    private Integer completedExams;
    private Integer totalXP;
    private Double averageScore;
    private LocalDateTime lastExamDate;
    private Integer mondayScore;
    private Integer tuesdayScore;
    private Integer wednesdayScore;
    private Integer thursdayScore;
    private Integer fridayScore;
    private Integer saturdayScore;
    private Integer sundayScore;

    public UserStatistics() {

    }

    public UserStatistics(User user, Integer totalExams, Integer completedExams, Integer totalXP, Double averageScore,
            LocalDateTime lastExamDate, Integer mondayScore, Integer tuesdayScore, Integer wednesdayScore,
            Integer thursdayScore, Integer fridayScore, Integer saturdayScore, Integer sundayScore) {
        this.user = user;
        this.totalExams = totalExams;
        this.completedExams = completedExams;
        this.totalXP = totalXP;
        this.averageScore = averageScore;
        this.lastExamDate = lastExamDate;
        this.mondayScore = mondayScore;
        this.tuesdayScore = tuesdayScore;
        this.wednesdayScore = wednesdayScore;
        this.thursdayScore = thursdayScore;
        this.fridayScore = fridayScore;
        this.saturdayScore = saturdayScore;
        this.sundayScore = sundayScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getTotalExams() {
        return totalExams;
    }

    public void setTotalExams(Integer totalExams) {
        this.totalExams = totalExams;
    }

    public Integer getCompletedExams() {
        return completedExams;
    }

    public void setCompletedExams(Integer completedExams) {
        this.completedExams = completedExams;
    }

    public Integer getTotalXP() {
        return totalXP;
    }

    public void setTotalXP(Integer totalXP) {
        this.totalXP = totalXP;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public LocalDateTime getLastExamDate() {
        return lastExamDate;
    }

    public void setLastExamDate(LocalDateTime lastExamDate) {
        this.lastExamDate = lastExamDate;
    }

    public Integer getMondayScore() {
        return mondayScore;
    }

    public void setMondayScore(Integer mondayScore) {
        this.mondayScore = mondayScore;
    }

    public Integer getTuesdayScore() {
        return tuesdayScore;
    }

    public void setTuesdayScore(Integer tuesdayScore) {
        this.tuesdayScore = tuesdayScore;
    }

    public Integer getWednesdayScore() {
        return wednesdayScore;
    }

    public void setWednesdayScore(Integer wednesdayScore) {
        this.wednesdayScore = wednesdayScore;
    }

    public Integer getThursdayScore() {
        return thursdayScore;
    }

    public void setThursdayScore(Integer thursdayScore) {
        this.thursdayScore = thursdayScore;
    }

    public Integer getFridayScore() {
        return fridayScore;
    }

    public void setFridayScore(Integer fridayScore) {
        this.fridayScore = fridayScore;
    }

    public Integer getSaturdayScore() {
        return saturdayScore;
    }

    public void setSaturdayScore(Integer saturdayScore) {
        this.saturdayScore = saturdayScore;
    }

    public Integer getSundayScore() {
        return sundayScore;
    }

    public void setSundayScore(Integer sundayScore) {
        this.sundayScore = sundayScore;
    }

}
