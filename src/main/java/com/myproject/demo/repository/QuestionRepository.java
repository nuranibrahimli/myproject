package com.myproject.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.demo.entity.Question;
import com.myproject.demo.model.enums.QuestionType;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByExamId(Long examId);

    List<Question> findByExamIdAndQuestionType(Long examId, QuestionType questionType);
}
