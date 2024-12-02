package com.myproject.demo.dto;

import java.util.Map;

public class StatisticsDTO {

    private Integer totalXP;
    private Double averageScore;
    private Map<String, Integer> weeklyPoints; // day:points

    // No-args constructor
    public StatisticsDTO() {
    }

    // All-args constructor
    public StatisticsDTO(Integer totalXP, Double averageScore, Map<String, Integer> weeklyPoints) {
        this.totalXP = totalXP;
        this.averageScore = averageScore;
        this.weeklyPoints = weeklyPoints;
    }

    // Getters and Setters
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

    public Map<String, Integer> getWeeklyPoints() {
        return weeklyPoints;
    }

    public void setWeeklyPoints(Map<String, Integer> weeklyPoints) {
        this.weeklyPoints = weeklyPoints;
    }
}
