package com.myproject.demo.service.impl;

import com.myproject.demo.dto.response.ExamResponseDTO;
import com.myproject.demo.model.enums.ExamType;
import com.myproject.demo.service.ExamService;
import com.myproject.demo.aspect.LogExecutionTime;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @LogExecutionTime
    @Override
    public ExamResponseDTO getExamById(Long id) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public List<ExamResponseDTO> getAllExams() {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public List<ExamResponseDTO> getExamsByType(ExamType examType) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public List<ExamResponseDTO> getActiveExams() {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public ExamResponseDTO startExam(Long examId, Long userId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public void finishExam(Long examId, Long userId) {
        // TODO: Implementation
    }

    @LogExecutionTime
    @Override
    public void deleteExam(Long id) {
        // TODO: Implementation
    }
}
