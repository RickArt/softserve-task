package com.github.rickart.softserve.task.algorithm;

public interface AlgorithmStrategyFactory {
    AlgorithmStrategy createStrategy(String originalString);
}
