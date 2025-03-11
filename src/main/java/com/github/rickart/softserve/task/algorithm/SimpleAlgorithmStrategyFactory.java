package com.github.rickart.softserve.task.algorithm;

import org.springframework.stereotype.Service;

@Service
public class SimpleAlgorithmStrategyFactory implements AlgorithmStrategyFactory{
    @Override
    public AlgorithmStrategy createStrategy(String originalString) {
        if ( originalString.length() < 800 ) {
            return new StreamAlgorithmStrategy();
        }
        return new LinearAlgorithmStrategy();
    }
}
