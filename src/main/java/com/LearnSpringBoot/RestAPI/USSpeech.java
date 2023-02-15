package com.LearnSpringBoot.RestAPI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class USSpeech implements Speech{
    @Override
    public void saySomething() {
        System.out.println("Hello");
    }
}
