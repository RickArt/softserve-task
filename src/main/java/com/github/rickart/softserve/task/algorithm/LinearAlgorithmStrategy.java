package com.github.rickart.softserve.task.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class LinearAlgorithmStrategy implements AlgorithmStrategy{
    @Override
    public String execute(String originalString) {
        Set<Character> distinctLettersSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for ( int index = 0; index < originalString.length(); index++ ) {
            Character letter = originalString.charAt(index);
            if ( !distinctLettersSet.contains(letter) ) {
                distinctLettersSet.add(letter);
                stringBuilder.append(letter);
            }
        }
        return stringBuilder.toString();
    }
}
