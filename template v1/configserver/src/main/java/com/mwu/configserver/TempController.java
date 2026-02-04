package com.mwu.configserver;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @org.springframework.web.bind.annotation.GetMapping("/temp")
    public String getTemp() {
        return "123 config server";
    }
}
