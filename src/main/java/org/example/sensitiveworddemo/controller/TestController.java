package org.example.sensitiveworddemo.controller;

import com.github.houbb.sensitive.word.bs.SensitiveWordBs;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzhilin
 * @version 2024
 * @date 2024/11/26 16:47
 **/
@RestController
@RequiredArgsConstructor
public class TestController {

    private final SensitiveWordBs sensitiveWordBs;

    @GetMapping("/test")
    public String test(@RequestParam String text) {
        return sensitiveWordBs.replace(text);
    }
}
