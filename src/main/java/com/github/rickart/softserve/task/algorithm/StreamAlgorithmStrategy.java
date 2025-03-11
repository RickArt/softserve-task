package com.github.rickart.softserve.task.algorithm;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAlgorithmStrategy implements AlgorithmStrategy{
    @Override
    public String execute(String originalString) {
        return Arrays.stream(originalString.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
