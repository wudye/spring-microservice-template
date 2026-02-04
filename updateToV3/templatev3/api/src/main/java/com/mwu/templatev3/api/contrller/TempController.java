package com.mwu.templatev3.api.contrller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
