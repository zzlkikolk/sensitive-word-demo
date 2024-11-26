package org.example.sensitiveworddemo.config;

import com.github.houbb.sensitive.word.api.IWordAllow;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @author zhangzhilin
 * @version 2024
 * @date 2024/11/26 16:51
 **/
@Component
public class LocalWordAllow implements IWordAllow {
    @Override
    public List<String> allow() {
        return Collections.emptyList();
    }
}
