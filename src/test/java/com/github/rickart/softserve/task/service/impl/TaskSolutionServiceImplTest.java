package com.github.rickart.softserve.task.service.impl;

import com.github.rickart.softserve.task.algorithm.AlgorithmStrategyFactory;
import com.github.rickart.softserve.task.algorithm.LinearAlgorithmStrategy;
import com.github.rickart.softserve.task.algorithm.StreamAlgorithmStrategy;
import com.github.rickart.softserve.task.dto.GetDistinctLettersResponseDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskSolutionServiceImplTest {

    @Mock
    private AlgorithmStrategyFactory strategyFactory;

    @InjectMocks
    private TaskSolutionServiceImpl taskSolutionService;

    @Test
    public void smallStringTest() {
        when(strategyFactory.createStrategy(anyString())).thenReturn(new StreamAlgorithmStrategy());
        GetDistinctLettersResponseDTO result = taskSolutionService.getDistincts("AABBCCD112233");
        assertEquals("ABCD123", result.getDistinctLetters());
    }

    @Test
    public void longStringTest() {
        String longString = "qJwZOXyPjWULEiYbV6kxzoh0PXsZYfntAidh1aiM6CoTCDAMroBehOx8AvOylFCVtYzWkRWtlxJnHJukdkT3eZiNLL97TVTSZbtsFAW5gTu8cGINeGVW06zKpq97AsoA0nMPyBTcdnjM8ra130nZqd8g077YYb02lfBppaBE7mpC1YPmOKocDGmoz2mmCyggzBykHYMP6WwqRbFOoTTYqkatoq7e9XSx2P7F4uEAqM3KeEu0oboLvmy2v3hYZWa8et8hJYCsI63w0WZlSF3Y34iUAchW6KqOQV7uCOWgjbpzTshwDvzl4unb3ZkarBM8DLfnYtD2dsN5wMjA4b0AkBaD9wbOXnt447ztGQzYGW3BOX6wJkopUM90hztvntURMA8by1UZwMnKrhyPLkwvGDhVxMHPWyRAf6BYxCXEjCyosE9fbXJ5MrfvwUb5Fxt4dAgYwDE6jM5QV4bOprpBCjpjfb0CJ8H7OPURkBTcOg1wgTxfEizYKpcL98KH8TqY6o1ATDY3ztVsK2hbvFAv3ZaqC7poYuHwevoZn1BeOizIpl6RpotGMrrZFFVDEDq9e2Ri1bJFjKrElaPWg0YD93NthYrtipw9XoXPMKhlzIJVyw9EbEXk4CY0F0YjtfuGIqgrQudzIlTY1LJ62mlgwp0cwDBVHsqzKhA9zBGv68LiTvWXYylXua7aBCpuc9bVWUMMNYo5QJDWYlX1bQKPcu2FLmQXWcLXw0xHoK6vRpuIFFocxYWLLaWmh2FxklE9Rgupoyy6IktF3wrrpmACq4ZHQqPyfpW";
        when(strategyFactory.createStrategy(anyString())).thenReturn(new StreamAlgorithmStrategy());
        GetDistinctLettersResponseDTO result = taskSolutionService.getDistincts(longString);
        assertEquals("qJwZOXyPjWULEiYbV6kxzoh0sfntAd1aMCTDrBe8vlFRHu3N97S5gcGIKp2m4Q", result.getDistinctLetters());
    }

    @Test
    public void longerStringTest() {
        String longString = "qJwZOXyPjWULEiYbV6kxzoh0PXsZYfntAidh1aiM6CoTCDAMroBehOx8AvOylFCVtYzWkRWtlxJnHJukdkT3eZiNLL97TVTSZbtsFAW5gTu8cGINeGVW06zKpq97AsoA0nMPyBTcdnjM8ra130nZqd8g077YYb02lfBppaBE7mpC1YPmOKocDGmoz2mmCyggzBykHYMP6WwqRbFOoTTYqkatoq7e9XSx2P7F4uEAqM3KeEu0oboLvmy2v3hYZWa8et8hJYCsI63w0WZlSF3Y34iUAchW6KqOQV7uCOWgjbpzTshwDvzl4unb3ZkarBM8DLfnYtD2dsN5wMjA4b0AkBaD9wbOXnt447ztGQzYGW3BOX6wJkopUM90hztvntURMA8by1UZwMnKrhyPLkwvGDhVxMHPWyRAf6BYxCXEjCyosE9fbXJ5MrfvwUb5Fxt4dAgYwDE6jM5QV4bOprpBCjpjfb0CJ8H7OPURkBTcOg1wgTxfEizYKpcL98KH8TqY6o1ATDY3ztVsK2hbvFAv3ZaqC7poYuHwevoZn1BeOizIpl6RpotGMrrZFFVDEDq9e2Ri1bJFjKrElaPWg0YD93NthYrtipw9XoXPMKhlzIJVyw9EbEXk4CY0F0YjtfuGIqgrQudzIlTY1LJ62mlgwp0cwDBVHsqzKhA9zBGv68LiTvWXYylXua7aBCpuc9bVWUMMNYo5QJDWYlX1bQKPcu2FLmQXWcLXw0xHoK6vRpuIFFocxYWLLaWmh2FxklE9Rgupoyy6IktF3wrrpmACq4ZHQqPyfpWqJwZOXyPjWULEiYbV6kxzoh0PXsZYfntAidh1aiM6CoTCDAMroBehOx8AvOylFCVtYzWkRWtlxJnHJukdkT3eZiNLL97TVTSZbtsFAW5gTu8cGINeGVW06zKpq97AsoA0nMPyBTcdnjM8ra130nZqd8g077YYb02lfBppaBE7mpC1YPmOKocDGmoz2mmCyggzBykHYMP6WwqRbFOoTTYqkatoq7e9XSx2P7F4uEAqM3KeEu0oboLvmy2v3hYZWa8et8hJYCsI63w0WZlSF3Y34iUAchW6KqOQV7uCOWgjbpzTshwDvzl4unb3ZkarBM8DLfnYtD2dsN5wMjA4b0AkBaD9wbOXnt447ztGQzYGW3BOX6wJkopUM90hztvntURMA8by1UZwMnKrhyPLkwvGDhVxMHPWyRAf6BYxCXEjCyosE9fbXJ5MrfvwUb5Fxt4dAgYwDE6jM5QV4bOprpBCjpjfb0CJ8H7OPURkBTcOg1wgTxfEizYKpcL98KH8TqY6o1ATDY3ztVsK2hbvFAv3ZaqC7poYuHwevoZn1BeOizIpl6RpotGMrrZFFVDEDq9e2Ri1bJFjKrElaPWg0YD93NthYrtipw9XoXPMKhlzIJVyw9EbEXk4CY0F0YjtfuGIqgrQudzIlTY1LJ62mlgwp0cwDBVHsqzKhA9zBGv68LiTvWXYylXua7aBCpuc9bVWUMMNYo5QJDWYlX1bQKPcu2FLmQXWcLXw0xHoK6vRpuIFFocxYWLLaWmh2FxklE9Rgupoyy6IktF3wrrpmACq4ZHQqPyfpW";
        when(strategyFactory.createStrategy(anyString())).thenReturn(new LinearAlgorithmStrategy());
        GetDistinctLettersResponseDTO result = taskSolutionService.getDistincts(longString);
        assertEquals("qJwZOXyPjWULEiYbV6kxzoh0sfntAd1aMCTDrBe8vlFRHu3N97S5gcGIKp2m4Q", result.getDistinctLetters());
    }
}