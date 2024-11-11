package com.myproject.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.demo.aspect.LogExecutionTime;
import com.myproject.demo.dto.response.UserAnswerResponseDTO;
import com.myproject.demo.service.UserAnswerService;

@Service
public class UserAnswerServiceImpl implements UserAnswerService {

    @LogExecutionTime
    @Override
    public UserAnswerResponseDTO saveUserAnswer(Long userId, Long questionId, String answer) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public List<UserAnswerResponseDTO> getUserAnswersByExamId(Long userId, Long examId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public UserAnswerResponseDTO getUserAnswerByQuestionId(Long userId, Long questionId) {
        // TODO: Implementation
        return null;
    }
}
