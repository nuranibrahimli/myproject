package com.myproject.demo.mapper;

import org.springframework.stereotype.Component;

import com.myproject.demo.dto.response.UserExamResponseDTO;
import com.myproject.demo.entity.UserExam;

@Component
public class UserExamMapper {

    public UserExamResponseDTO toDto(UserExam userExam) {
        if (userExam == null) {
            return null;
        }

        UserExamResponseDTO dto = new UserExamResponseDTO();
        dto.setId(userExam.getId());
        dto.setUserId(userExam.getUserId());
        dto.setExamId(userExam.getExamId());
        dto.setStartTime(userExam.getStartTime());
        dto.setEndTime(userExam.getEndTime());
        dto.setScore(userExam.getScore().doubleValue());
        dto.setStatus(userExam.getStatus().name());

        return dto;
    }

    public void updateEntityFromDto(UserExamResponseDTO dto, UserExam userExam) {
        if (dto == null || userExam == null) {
            return;
        }

        userExam.setStartTime(dto.getStartTime());
        userExam.setEndTime(dto.getEndTime());
        userExam.setScore(dto.getScore().intValue());
    }
}
