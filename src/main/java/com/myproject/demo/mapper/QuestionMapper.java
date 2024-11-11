package com.myproject.demo.mapper;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.myproject.demo.dto.QuestionRequestDTO;
import com.myproject.demo.dto.response.QuestionResponseDTO;
import com.myproject.demo.entity.Question;

@Component
public class QuestionMapper {

    public QuestionResponseDTO toDto(Question question) {
        if (question == null) {
            return null;
        }

        QuestionResponseDTO dto = new QuestionResponseDTO();
        dto.setId(question.getId());
        dto.setExamId(question.getExamId());
        dto.setQuestionType(question.getQuestionType());
        dto.setQuestionText(question.getQuestionText());
        dto.setOptions(Arrays.asList(question.getOptions().split(",")));
        dto.setAudioUrl(question.getAudioUrl());

        return dto;
    }

    public Question toEntity(QuestionRequestDTO dto) {
        if (dto == null) {
            return null;
        }

        Question question = new Question();
        question.setExamId(dto.getExamId());
        question.setQuestionType(dto.getQuestionType());
        question.setQuestionText(dto.getQuestionText());
        question.setCorrectAnswer(dto.getCorrectAnswer());
        question.setOptions(String.join(",", dto.getOptions()));
        question.setAudioUrl(dto.getAudioUrl());

        return question;
    }
}
