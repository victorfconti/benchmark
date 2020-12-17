package br.com.victor.streammermultiquality.hdservice.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(IOException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> ioException(){
        Map<String, String> response = new HashMap<>();
        response.put("error", "cannot open file");
        return response;
    }

}
