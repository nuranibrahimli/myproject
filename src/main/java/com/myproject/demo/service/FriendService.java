package com.myproject.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.myproject.demo.dto.FriendDTO;
import com.myproject.demo.dto.LeaderboardDTO;
import com.myproject.demo.entity.Friend;
import com.myproject.demo.repository.FriendRepository;
import com.myproject.demo.repository.UserRepository;

@Service
public class FriendService {

    private final FriendRepository friendRepository;
    private final UserRepository userRepository;

    public FriendService(FriendRepository friendRepository, UserRepository userRepository) {
        this.friendRepository = friendRepository;
        this.userRepository = userRepository;
    }

    public LeaderboardDTO getLeaderboard(Long userId) {
        List<Friend> friends = friendRepository.findByUserIdOrderByXpPointsDesc(userId);

        LeaderboardDTO dto = new LeaderboardDTO();
        dto.setFriends(friends.stream()
                .map(this::toFriendDTO)
                .collect(Collectors.toList()));

        // istifadəçinin rankını hesablayırıq
        int rank = calculateUserRank(userId);
        dto.setUserRank(rank);

        return dto;
    }

    private FriendDTO toFriendDTO(Friend friend) {
        FriendDTO dto = new FriendDTO();
        dto.setId(friend.getId());
        dto.setUsername(friend.getFriend().getUsername());
        dto.setXpPoints(friend.getXpPoints());
        dto.setProfileImage(friend.getFriend().getProfileImage());
        return dto;
    }

    private int calculateUserRank(Long userId) {
        // rank hesablama logikası
        return 1;
    }
}
