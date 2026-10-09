# hello-demo

Reference module, not part of the business services.

Shows how one HTTP request travels through a Spring Boot app:

1. Servlet filter (`LoggingFilter`), before `chain.doFilter`
2. `DispatcherServlet` picks the handler, then the interceptor `preHandle` (`LoggingInterceptor`)
3. Controller method (`HelloController`)
4. Interceptor `afterCompletion`, then the filter again after `chain.doFilter`

Run: start `HelloApplication`, then `curl.exe "http://localhost:8099/hello?name=Test"`
and watch the numbered log lines in the console.