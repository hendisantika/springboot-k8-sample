package com.hendisantika.k8s.springbootk8sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-k8-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-07
 * Time: 07:44
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/isReady")
    public ResponseEntity<String> isReady() {

        return new ResponseEntity<>("I'm ready! " + new Date(), HttpStatus.OK);

    }

    @GetMapping("/isAlive")
    public ResponseEntity<String> isAlive() {

        return new ResponseEntity<>("I'm alive! " + new Date(), HttpStatus.OK);

    }

    @PostMapping("/echo")
    public ResponseEntity<?> testResponse(@RequestBody String body) {

        return new ResponseEntity<>("You said: " + new Date() + " " + body, HttpStatus.OK);

    }
}
