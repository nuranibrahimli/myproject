package com.myproject.demo.service;

import java.util.List;

import com.myproject.demo.dto.response.QuestionResponseDTO;

public interface QuestionService {

    QuestionResponseDTO getQuestionById(Long id);

    List<QuestionResponseDTO> getQuestionsByExamId(Long examId);

    QuestionResponseDTO getNextQuestion(Long examId, Long currentQuestionId);

    void deleteQuestion(Long id);
}
