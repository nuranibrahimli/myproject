package com.myproject.demo.service;

import java.util.List;

import com.myproject.demo.dto.response.ExamResponseDTO;
import com.myproject.demo.model.enums.ExamType;

public interface ExamService {

    ExamResponseDTO getExamById(Long id);

    List<ExamResponseDTO> getAllExams();

    List<ExamResponseDTO> getExamsByType(ExamType examType);

    List<ExamResponseDTO> getActiveExams();

    ExamResponseDTO startExam(Long examId, Long userId);

    void finishExam(Long examId, Long userId);

    void deleteExam(Long id);
}
