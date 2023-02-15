package com.LearnSpringBoot.RestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeechController {
    @Autowired
    Speech speech;
    @GetMapping("/hello")
    public void hello(){
        speech.saySomething();
    }
}
