package com.zz.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;

/**
 * @Author zwh
 * @Date 2020/7/7 11:42
 * @Version 1.0
 **/
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistration(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("utf-8");
        filterFilterRegistrationBean.setFilter(characterEncodingFilter);
        return filterFilterRegistrationBean;
    }
}
