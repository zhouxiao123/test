package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Administrator on 2017/2/16.
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
public class WebAuthConfiguration extends WebSecurityConfigurerAdapter {

}
