package com.github.rickart.softserve.task.service.impl;

import com.github.rickart.softserve.task.algorithm.AlgorithmStrategy;
import com.github.rickart.softserve.task.algorithm.AlgorithmStrategyFactory;
import com.github.rickart.softserve.task.dto.GetDistinctLettersResponseDTO;
import com.github.rickart.softserve.task.service.TaskSolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TaskSolutionServiceImpl implements TaskSolutionService {

    private final AlgorithmStrategyFactory strategyFactory;

    @Autowired
    public TaskSolutionServiceImpl(AlgorithmStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    @Override
    public GetDistinctLettersResponseDTO getDistincts(String originalString) {
        AlgorithmStrategy strategy = strategyFactory.createStrategy(originalString);

        return new GetDistinctLettersResponseDTO(
                HttpStatus.OK.value(),
                strategy.execute(originalString));
    }
}
