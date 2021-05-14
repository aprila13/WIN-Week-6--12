package com.tts.week13day5.controller;

import com.tts.week13day5.model.Subscriber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SubscriberController {

    @GetMapping
    public String index(Subscriber subscriber) {
        return "subscriber/index";
    }
}
