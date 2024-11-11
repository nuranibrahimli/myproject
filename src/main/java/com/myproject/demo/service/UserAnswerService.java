package com.myproject.demo.service;

import java.util.List;

import com.myproject.demo.dto.response.UserAnswerResponseDTO;

public interface UserAnswerService {

    UserAnswerResponseDTO saveUserAnswer(Long userId, Long questionId, String answer);

    List<UserAnswerResponseDTO> getUserAnswersByExamId(Long userId, Long examId);

    UserAnswerResponseDTO getUserAnswerByQuestionId(Long userId, Long questionId);
}
