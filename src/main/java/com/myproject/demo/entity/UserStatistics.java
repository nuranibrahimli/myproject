package com.myproject.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
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
    private Integer mondayPoints;
    private Integer tuesdayPoints;
    private Integer wednesdayPoints;
    private Integer thursdayPoints;
    private Integer fridayPoints;
    private Integer saturdayPoints;
    private Integer sundayPoints;

    public UserStatistics() {
    }

    public UserStatistics(User user, Integer totalExams, Integer completedExams, Integer totalXP, Double averageScore,
            LocalDateTime lastExamDate, Integer mondayPoints, Integer tuesdayPoints, Integer wednesdayPoints,
            Integer thursdayPoints, Integer fridayPoints, Integer saturdayPoints, Integer sundayPoints) {
        this.user = user;
        this.totalExams = totalExams;
        this.completedExams = completedExams;
        this.totalXP = totalXP;
        this.averageScore = averageScore;
        this.lastExamDate = lastExamDate;
        this.mondayPoints = mondayPoints;
        this.tuesdayPoints = tuesdayPoints;
        this.wednesdayPoints = wednesdayPoints;
        this.thursdayPoints = thursdayPoints;
        this.fridayPoints = fridayPoints;
        this.saturdayPoints = saturdayPoints;
        this.sundayPoints = sundayPoints;
    }

    // Getters and setters

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

    public Integer getMondayPoints() {
        return mondayPoints;
    }

    public void setMondayPoints(Integer mondayPoints) {
        this.mondayPoints = mondayPoints;
    }

    public Integer getTuesdayPoints() {
        return tuesdayPoints;
    }

    public void setTuesdayPoints(Integer tuesdayPoints) {
        this.tuesdayPoints = tuesdayPoints;
    }

    public Integer getWednesdayPoints() {
        return wednesdayPoints;
    }

    public void setWednesdayPoints(Integer wednesdayPoints) {
        this.wednesdayPoints = wednesdayPoints;
    }

    public Integer getThursdayPoints() {
        return thursdayPoints;
    }

    public void setThursdayPoints(Integer thursdayPoints) {
        this.thursdayPoints = thursdayPoints;
    }

    public Integer getFridayPoints() {
        return fridayPoints;
    }

    public void setFridayPoints(Integer fridayPoints) {
        this.fridayPoints = fridayPoints;
    }

    public Integer getSaturdayPoints() {
        return saturdayPoints;
    }

    public void setSaturdayPoints(Integer saturdayPoints) {
        this.saturdayPoints = saturdayPoints;
    }

    public Integer getSundayPoints() {
        return sundayPoints;
    }

    public void setSundayPoints(Integer sundayPoints) {
        this.sundayPoints = sundayPoints;
    }

    @Override
    public String toString() {
        return "UserStatistics{" +
                "id=" + id +
                ", user=" + user +
                ", totalExams=" + totalExams +
                ", completedExams=" + completedExams +
                ", totalXP=" + totalXP +
                ", averageScore=" + averageScore +
                ", lastExamDate=" + lastExamDate +
                ", mondayPoints=" + mondayPoints +
                ", tuesdayPoints=" + tuesdayPoints +
                ", wednesdayPoints=" + wednesdayPoints +
                ", thursdayPoints=" + thursdayPoints +
                ", fridayPoints=" + fridayPoints +
                ", saturdayPoints=" + saturdayPoints +
                ", sundayPoints=" + sundayPoints +
                '}';
    }
}