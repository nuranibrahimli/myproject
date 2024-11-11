package com.myproject.demo.service;

import java.util.List;

import com.myproject.demo.dto.response.UserExamResponseDTO;

public interface UserExamService {

    UserExamResponseDTO getUserExamById(Long id);

    List<UserExamResponseDTO> getUserExamsByUserId(Long userId);

    List<UserExamResponseDTO> getUserExamsByExamId(Long examId);

    UserExamResponseDTO getCurrentExamStatus(Long userId, Long examId);
}
