package com.mwu.licensingservice.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18n {
    @Bean
    @Primary
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public org.springframework.web.servlet.LocaleResolver localeResolver() {
        org.springframework.web.servlet.i18n.SessionLocaleResolver localeResolver = new org.springframework.web.servlet.i18n.SessionLocaleResolver();
        localeResolver.setDefaultLocale(java.util.Locale.US);
        return localeResolver;
    }
}
