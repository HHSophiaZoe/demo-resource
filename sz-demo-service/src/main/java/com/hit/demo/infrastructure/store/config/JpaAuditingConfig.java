package com.hit.demo.infrastructure.store.config;

import com.hit.spring.context.SecurityContext;
import com.hit.spring.core.data.model.SimpleSecurityUser;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@ConditionalOnProperty(
        value = {"datasource.default.enable"},
        havingValue = "true"
)
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class JpaAuditingConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of(
                Optional.ofNullable(SecurityContext.getSimpleSecurityUser())
                        .map(SimpleSecurityUser::getId).orElse("ANONYMOUS")
        );
    }
}
