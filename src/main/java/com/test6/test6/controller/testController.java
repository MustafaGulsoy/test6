package com.test6.test6.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class testController {

    @PostMapping("/adduser")
    public ResponseEntity<String> adduser(@RequestBody String  id)
    {       

        return ResponseEntity.ok("sds");

    }
    @DeleteMapping("/deleteuser")
    public ResponseEntity<String> deleteuser()
    {
        return ResponseEntity.ok("sds");

    }
    @PutMapping("/create")
    public ResponseEntity<String> create()
    {
        return ResponseEntity.ok("sdss");

    }
    @GetMapping("/getlist")
    public ResponseEntity<String> getlist()
    {
        return ResponseEntity.ok("sds");

    }

}
