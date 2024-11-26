package org.example.sensitiveworddemo.config;

import com.github.houbb.sensitive.word.api.IWordDeny;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhangzhilin
 * @version 2024
 * @date 2024/11/26 16:35
 **/
@Component
public class DataBaseWordDeny implements IWordDeny {

    /**
     * 模拟需要屏蔽的敏感词
     * @return 敏感词列表
     */
    @Override
    public List<String> deny() {
        return List.of("hello","world","nice too meet you");
    }
}
