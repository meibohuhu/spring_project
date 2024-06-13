package com.example.testservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class Controller {

    @GetMapping()
    public ResponseEntity<String> getTest(){
        return new ResponseEntity<>("Yeeees", HttpStatus.OK);
    }
}
