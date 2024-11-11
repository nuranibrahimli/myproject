package com.myproject.demo.service;

import com.myproject.demo.dto.response.ExamResultResponseDTO;

public interface ExamResultService {

    ExamResultResponseDTO calculateExamResult(Long userId, Long examId);

    ExamResultResponseDTO getExamResult(Long userId, Long examId);

    void saveExamResult(Long userId, Long examId, ExamResultResponseDTO result);
}
