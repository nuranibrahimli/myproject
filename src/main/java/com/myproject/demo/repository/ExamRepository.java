package com.myproject.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.demo.entity.Exam;
import com.myproject.demo.model.enums.ExamStatus;
import com.myproject.demo.model.enums.ExamType;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

    List<Exam> findByExamType(ExamType examType);

    List<Exam> findByStatus(ExamStatus status);

    List<Exam> findByExamTypeAndStatus(ExamType examType, ExamStatus status);
}
