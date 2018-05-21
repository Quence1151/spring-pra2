package com.example.spring_pra2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //@Coifiguration이 붙은 예제코드를 살리기 위해 사용 -> 실제 업무에선 거의 사용X
)
public class AutoAppConfig {

}
