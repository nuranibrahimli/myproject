package com.myproject.demo.mapper;

import org.springframework.stereotype.Component;

import com.myproject.demo.dto.ExamRequestDTO;
import com.myproject.demo.dto.response.ExamResponseDTO;
import com.myproject.demo.entity.Exam;

@Component
public class ExamMapper {

    public ExamResponseDTO toDto(Exam exam) {
        if (exam == null) {
            return null;
        }

        ExamResponseDTO dto = new ExamResponseDTO();
        dto.setId(exam.getId());
        dto.setExamType(exam.getExamType());
        dto.setTitle(exam.getTitle());
        dto.setDescription(exam.getDescription());
        dto.setTotalQuestions(exam.getTotalQuestions());
        dto.setTimePerQuestion(exam.getTimePerQuestion());
        dto.setStatus(exam.getStatus().name());

        return dto;
    }

    public Exam toEntity(ExamRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        Exam exam = new Exam();
        exam.setExamType(dto.getExamType());
        exam.setTitle(dto.getTitle());
        exam.setDescription(dto.getDescription());
        exam.setTotalQuestions(dto.getTotalQuestions());
        exam.setTimePerQuestion(dto.getTimePerQuestion());

        return exam;
    }

    public void updateEntityFromDto(ExamRequestDTO dto, Exam exam) {
        if (dto == null || exam == null) {
            return;
        }

        exam.setExamType(dto.getExamType());
        exam.setTitle(dto.getTitle());
        exam.setDescription(dto.getDescription());
        exam.setTotalQuestions(dto.getTotalQuestions());
        exam.setTimePerQuestion(dto.getTimePerQuestion());
    }
}
