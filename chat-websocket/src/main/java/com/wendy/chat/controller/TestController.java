package com.wendy.chat.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> test() {
        System.out.println("testing");
        return new ResponseEntity<>("ok", HttpStatus.ACCEPTED);
    }
}
