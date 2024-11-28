package br.senac.sp.erros.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ErrosHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> tratarRunTimeException(RuntimeException rt){

        return ResponseEntity.badRequest().body(rt.getMessage());
    }
}
