package com.test6.test6.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test6")
public class testController {

    @GetMapping("/getexample")
    public ResponseEntity<String> example()
    {
        return ResponseEntity.ok("sds");

    }
}
