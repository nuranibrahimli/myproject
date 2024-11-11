package com.myproject.demo.mapper;

import org.springframework.stereotype.Component;

import com.myproject.demo.dto.UserAnswerRequestDTO;
import com.myproject.demo.dto.response.UserAnswerResponseDTO;
import com.myproject.demo.entity.UserAnswer;

@Component
public class UserAnswerMapper {

    public UserAnswerResponseDTO toDto(UserAnswer userAnswer) {
        if (userAnswer == null) {
            return null;
        }

        UserAnswerResponseDTO dto = new UserAnswerResponseDTO();
        dto.setId(userAnswer.getId());
        dto.setQuestionId(userAnswer.getQuestionId());
        dto.setUserAnswer(userAnswer.getUserAnswer());
        dto.setIsCorrect(userAnswer.getIsCorrect());

        return dto;
    }

    public UserAnswer toEntity(UserAnswerRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        UserAnswer userAnswer = new UserAnswer();
        userAnswer.setUserId(dto.getUserId());
        userAnswer.setExamId(dto.getExamId());
        userAnswer.setQuestionId(dto.getQuestionId());
        userAnswer.setUserAnswer(dto.getUserAnswer());

        return userAnswer;
    }
}
