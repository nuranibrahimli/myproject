package com.myproject.demo.dto;

public class FriendDTO {
    private Long id;
    private String username;
    private Integer xpPoints;
    private String profileImage;

    // No-args constructor
    public FriendDTO() {}

    // All-args constructor
    public FriendDTO(Long id, String username, Integer xpPoints, String profileImage) {
        this.id = id;
        this.username = username;
        this.xpPoints = xpPoints;
        this.profileImage = profileImage;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getXpPoints() {
        return xpPoints;
    }

    public void setXpPoints(Integer xpPoints) {
        this.xpPoints = xpPoints;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}