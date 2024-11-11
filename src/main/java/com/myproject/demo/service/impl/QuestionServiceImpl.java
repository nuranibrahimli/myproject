package com.myproject.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.demo.aspect.LogExecutionTime;
import com.myproject.demo.dto.response.QuestionResponseDTO;
import com.myproject.demo.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    @LogExecutionTime
    @Override
    public QuestionResponseDTO getQuestionById(Long id) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public List<QuestionResponseDTO> getQuestionsByExamId(Long examId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public QuestionResponseDTO getNextQuestion(Long examId, Long currentQuestionId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public void deleteQuestion(Long id) {
        // TODO: Implementation
    }
}
