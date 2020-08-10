package io.github.harvies.charon.spring.boot.web.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({CharonSwaggerProperties.class})
public class CharonSwaggerConfiguration {


}
