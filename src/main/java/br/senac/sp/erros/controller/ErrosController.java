package br.senac.sp.erros.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class ErrosController {
    @GetMapping("/pessoas")
    public ResponseEntity<String> getPessoa() {
        throw new RuntimeException("forçando erro");
        //return ResponseEntity.ok("Renan");
    }
}
