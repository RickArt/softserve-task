package com.github.rickart.softserve.task.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetDistinctLettersResponseDTO{
    private int status;
    private String distinctLetters;
}
