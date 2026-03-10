package tech.jamersondev.ansible_awx_lab.configuration;

import feign.RequestInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignInterceptorConfig {

    @Value("${awx.token}")
    private String token;

    @Bean
    public RequestInterceptor requestInterceptor(){
        return
                requestTemplate -> {
                    requestTemplate.header("Authorization", String.format("Bearer %s", token));
                };
    }


}
