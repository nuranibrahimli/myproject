package com.myproject.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.demo.entity.UserAnswer;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {

    List<UserAnswer> findByUserId(Long userId);

    List<UserAnswer> findByExamId(Long examId);

    List<UserAnswer> findByUserIdAndExamId(Long userId, Long examId);

    List<UserAnswer> findByUserIdAndExamIdAndIsCorrect(Long userId, Long examId, Boolean isCorrect);
}
