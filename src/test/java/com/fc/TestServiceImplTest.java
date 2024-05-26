package com.fc;

import com.fc.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
public class TestServiceImplTest {
    @Autowired
    private TestService testService;

    @Value("@{server.port")
    private String port;

    @Value("${spring.application.name}")
    private String application;

    @Test
    void getTestStringSuccess(){
        assertEquals(testService.getTestString(), "okay develop server 3444");
    }

    @Test
    void getTestStringFail(){
        assertNotEquals(testService.getTestString(), "okay develop server 8080");
    }

}
