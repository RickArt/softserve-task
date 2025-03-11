package com.github.rickart.softserve.task.rest;

import com.github.rickart.softserve.task.dto.GetDistinctLettersResponseDTO;
import com.github.rickart.softserve.task.service.TaskSolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRestController {

    TaskSolutionService taskSolutionService;

    @Autowired
    public TaskRestController(TaskSolutionService taskSolutionService) {
        this.taskSolutionService = taskSolutionService;
    }

    @GetMapping(value = "/distinct",
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GetDistinctLettersResponseDTO> getDisctinctLetters(
            @RequestParam String originalString
    ) {
        return ResponseEntity.ok(taskSolutionService.getDistincts(originalString));
    }
}
