package com.myproject.demo.service.impl;

import org.springframework.stereotype.Service;

import com.myproject.demo.aspect.LogExecutionTime;
import com.myproject.demo.dto.response.ExamResultResponseDTO;
import com.myproject.demo.service.ExamResultService;

@Service
public class ExamResultServiceImpl implements ExamResultService {

    @LogExecutionTime
    @Override
    public ExamResultResponseDTO calculateExamResult(Long userId, Long examId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public ExamResultResponseDTO getExamResult(Long userId, Long examId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public void saveExamResult(Long userId, Long examId, ExamResultResponseDTO result) {
        // TODO: Implementation
    }
}
