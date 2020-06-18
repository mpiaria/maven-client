package dev.partlycloudy.maven.config;

import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.Invoker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MavenClientConfig {
    @Bean
    public Invoker invoker() {
        return new DefaultInvoker();
    }
}
