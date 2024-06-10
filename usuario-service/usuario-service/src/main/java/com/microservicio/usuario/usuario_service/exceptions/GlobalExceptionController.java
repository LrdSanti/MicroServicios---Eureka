package com.microservicio.usuario.usuario_service.exceptions;

import com.microservicio.usuario.usuario_service.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

    public ResponseEntity<ApiResponse> handlerResourcerNotFoundException(ResourcerNotFoundException resourcerNotFoundException){

        String message = resourcerNotFoundException.getMessage();

        ApiResponse response = new ApiResponse().builder()
                .message(message)
                .success(true)
                .status(HttpStatus.NOT_FOUND)
                .build();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
