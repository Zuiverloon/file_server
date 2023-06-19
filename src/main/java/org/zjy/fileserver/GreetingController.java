package org.zjy.fileserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, World";

    @GetMapping("/greeting")
    public String greeting() {
        return template;
    }
}