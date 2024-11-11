package com.myproject.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.demo.aspect.LogExecutionTime;
import com.myproject.demo.dto.response.UserExamResponseDTO;
import com.myproject.demo.service.UserExamService;

@Service
public class UserExamServiceImpl implements UserExamService {

    @LogExecutionTime
    @Override
    public UserExamResponseDTO getUserExamById(Long id) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public List<UserExamResponseDTO> getUserExamsByUserId(Long userId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public List<UserExamResponseDTO> getUserExamsByExamId(Long examId) {
        // TODO: Implementation
        return null;
    }

    @LogExecutionTime
    @Override
    public UserExamResponseDTO getCurrentExamStatus(Long userId, Long examId) {
        // TODO: Implementation
        return null;
    }
}
