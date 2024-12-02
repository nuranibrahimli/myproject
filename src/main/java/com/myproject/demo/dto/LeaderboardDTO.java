package com.myproject.demo.dto;

import java.util.List;

public class LeaderboardDTO {

    private List<FriendDTO> friends;
    private Integer userRank;
    private Integer totalXP;

    public LeaderboardDTO() {
    }

    public LeaderboardDTO(List<FriendDTO> friends, Integer userRank, Integer totalXP) {
        this.friends = friends;
        this.userRank = userRank;
        this.totalXP = totalXP;
    }

    // Getters and Setters
    public List<FriendDTO> getFriends() {
        return friends;
    }

    public void setFriends(List<FriendDTO> friends) {
        this.friends = friends;
    }

    public Integer getUserRank() {
        return userRank;
    }

    public void setUserRank(Integer userRank) {
        this.userRank = userRank;
    }

    public Integer getTotalXP() {
        return totalXP;
    }

    public void setTotalXP(Integer totalXP) {
        this.totalXP = totalXP;
    }
}
