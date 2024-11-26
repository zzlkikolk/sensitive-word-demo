package org.example.sensitiveworddemo.config;

import com.github.houbb.sensitive.word.bs.SensitiveWordBs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangzhilin
 * @version 2024
 * @date 2024/11/26 16:23
 **/
@Configuration
public class SensitiveWordHelperConfig {

    @Bean
    public SensitiveWordBs init(DataBaseWordDeny wordDeny,LocalWordAllow wordAllow) {
       return SensitiveWordBs.newInstance().wordDeny(wordDeny).wordAllow(wordAllow).init();
    }
}
