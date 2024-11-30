package org.youcode.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.youcode.security.repository.AppUserRepository;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final AppUserRepository appUserRepository;

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> appUserRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }
}
