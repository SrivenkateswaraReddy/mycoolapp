package com.springboot.demo.mycoolapp.contoller;

import com.springboot.demo.mycoolapp.controller.Hello;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class HelloControllerTest {

    @Mock
    private Logger loggerMock;

    @InjectMocks
    private Hello helloController;

    @Test
    void testSayHello() {
        // Arrange
        String expectedMessage = "Hello";
        ResponseEntity<String> expectedResponse = new ResponseEntity<>(expectedMessage, HttpStatus.OK);

        // Act
        ResponseEntity<String> actualResponse = helloController.sayHello();

        // Assert
        assertEquals(expectedResponse, actualResponse);
        verify(loggerMock, times(1)).info("currently in hello method");
    }
}
