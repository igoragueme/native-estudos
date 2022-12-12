package br.com.aguemei.nativeestudos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @PostMapping("/teste")
    public ResponseEntity<String> teste(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
