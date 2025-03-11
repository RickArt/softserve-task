package com.github.rickart.softserve.task.service;

import com.github.rickart.softserve.task.dto.GetDistinctLettersResponseDTO;

public interface TaskSolutionService {
    GetDistinctLettersResponseDTO getDistincts(String originalString);
}
