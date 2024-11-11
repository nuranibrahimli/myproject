package com.myproject.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.demo.entity.UserExam;
import com.myproject.demo.model.enums.ExamStatus;

@Repository
public interface UserExamRepository extends JpaRepository<UserExam, Long> {

    List<UserExam> findByUserId(Long userId);

    List<UserExam> findByExamId(Long examId);

    List<UserExam> findByUserIdAndStatus(Long userId, ExamStatus status);

    Optional<UserExam> findByUserIdAndExamId(Long userId, Long examId);
}
