package com.github.rickart.softserve.task.rest;

import com.github.rickart.softserve.task.dto.ErrorResponseDTO;
import com.github.rickart.softserve.task.dto.GetDistinctLettersResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TaskRestControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnBadRequest() {
        ResponseEntity<ErrorResponseDTO> errorResponse = this.restTemplate.getForEntity("http://localhost:" + port + "/distinct", ErrorResponseDTO.class);
        assertEquals(HttpStatus.BAD_REQUEST.value(), errorResponse.getBody().getStatus());
    }

    @Test
    public void shouldReturnDistinct() {
        ResponseEntity<GetDistinctLettersResponseDTO> response = this.restTemplate.getForEntity("http://localhost:" + port + "/distinct?originalString=AABB", GetDistinctLettersResponseDTO.class);
        assertEquals(HttpStatus.OK.value(), response.getBody().getStatus());
        assertEquals("AB", response.getBody().getDistinctLetters());
    }
}