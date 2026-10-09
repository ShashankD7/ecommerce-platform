package com.ecommerce.hello;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class LoggingInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        log.info("2. INTERCEPT: preHandle  (DispatcherServlet found handler: {})", handler);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex) {
        log.info("5. INTERCEPT: afterCompletion");
    }

    @Configuration
    static class Registration implements WebMvcConfigurer{
        private final LoggingInterceptor interceptor;

        Registration(LoggingInterceptor interceptor) {
            this.interceptor = interceptor;
        }

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(interceptor);
        }
    }
}