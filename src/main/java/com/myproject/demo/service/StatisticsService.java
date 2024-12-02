package com.myproject.demo.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.myproject.demo.dto.StatisticsDTO;
import com.myproject.demo.entity.UserStatistics;
import com.myproject.demo.repository.UserStatisticsRepository;

@Service
public class StatisticsService {

    private final UserStatisticsRepository statsRepository;

    public StatisticsService(UserStatisticsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    public StatisticsDTO getUserStatistics(Long userId) {
        UserStatistics stats = statsRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Statistics not found"));

        StatisticsDTO dto = new StatisticsDTO();
        dto.setTotalXP(stats.getTotalXP());
        dto.setAverageScore(stats.getAverageScore());

        Map<String, Integer> weeklyPoints = new LinkedHashMap<>();
        weeklyPoints.put("Monday", stats.getMondayPoints());
        weeklyPoints.put("Tuesday", stats.getTuesdayPoints());
        weeklyPoints.put("Wednesday", stats.getWednesdayPoints());
        weeklyPoints.put("Thursday", stats.getThursdayPoints());
        weeklyPoints.put("Friday", stats.getFridayPoints());
        weeklyPoints.put("Saturday", stats.getSaturdayPoints());
        weeklyPoints.put("Sunday", stats.getSundayPoints());

        dto.setWeeklyPoints(weeklyPoints);
        return dto;
    }

    public void updateDailyPoints(Long userId, Integer points) {
        UserStatistics stats = statsRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Statistics not found"));

        // Günə görə point update
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        switch (today) {
            case MONDAY:
                stats.setMondayPoints(points);
                break;
            case TUESDAY:
                stats.setTuesdayPoints(points);
                break;
            case WEDNESDAY:
                stats.setWednesdayPoints(points);
                break;
            case THURSDAY:
                stats.setThursdayPoints(points);
                break;
            case FRIDAY:
                stats.setFridayPoints(points);
                break;
            case SATURDAY:
                stats.setSaturdayPoints(points);
                break;
            case SUNDAY:
                stats.setSundayPoints(points);
                break;
        }

        statsRepository.save(stats);
    }
}
