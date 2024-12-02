package com.myproject.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.demo.dto.LeaderboardDTO;
import com.myproject.demo.dto.StatisticsDTO;
import com.myproject.demo.service.FriendService;
import com.myproject.demo.service.StatisticsService;

@RestController
@RequestMapping("/api")
public class LeaderboardController {

    private final FriendService friendService;
    private final StatisticsService statisticsService;

    public LeaderboardController(FriendService friendService, StatisticsService statisticsService) {
        this.friendService = friendService;
        this.statisticsService = statisticsService;
    }

    @GetMapping("/leaderboard")
    public ResponseEntity<LeaderboardDTO> getLeaderboard(@RequestParam Long userId) {
        return ResponseEntity.ok(friendService.getLeaderboard(userId));
    }

    @GetMapping("/statistics")
    public ResponseEntity<StatisticsDTO> getStatistics(@RequestParam Long userId) {
        return ResponseEntity.ok(statisticsService.getUserStatistics(userId));
    }

    @PostMapping("/statistics/points")
    public ResponseEntity<Void> updatePoints(@RequestParam Long userId, @RequestParam Integer points) {
        statisticsService.updateDailyPoints(userId, points);
        return ResponseEntity.ok().build();
    }
}
