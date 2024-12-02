package com.myproject.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.demo.entity.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

    List<Friend> findByUserIdOrderByXpPointsDesc(Long userId);

    Optional<Friend> findByUserIdAndFriendId(Long userId, Long friendId);
}
