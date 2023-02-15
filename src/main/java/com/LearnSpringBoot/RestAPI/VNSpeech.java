package com.LearnSpringBoot.RestAPI;

import org.springframework.stereotype.Component;

@Component
public class VNSpeech implements Speech{
    @Override
    public void saySomething() {
        System.out.println("XinChao");

    }
}
