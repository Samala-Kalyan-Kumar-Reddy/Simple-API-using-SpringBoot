package com.codingKalyan.SpringBoot.controller;

import com.codingKalyan.SpringBoot.Model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessageController {

    @GetMapping("/message")
    public Message getMessage() {
        return new Message("Hello, World!");
    }

    @PostMapping("/message")
    public Message postMessage(@RequestBody Message message) {
        return new Message("Received: " + message.getContent());
    }
}
