package org.spring.swagger;

import brave.Tracing;
import brave.opentracing.BraveTracer;
import org.spring.swagger.bean.User;
import org.spring.swagger.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;
import zipkin.Span;
import zipkin.reporter.AsyncReporter;
import zipkin.reporter.okhttp3.OkHttpSender;


@SpringBootApplication
public class Application {

    /*@Bean
    RestTemplate restTemplate(RestTemplate restTemplate){
        return new RestTemplate();
    }*/

   /* @Bean
    public io.opentracing.Tracer zipkinTracer()
    {
        OkHttpSender okHttpSender = OkHttpSender.create("http://localhost:9411/api/v1/spans");
        AsyncReporter<Span> reporter = AsyncReporter.builder(okHttpSender).queuedMaxSpans(1).build();
        Tracing braveTracer = Tracing.newBuilder().localServiceName("zipkin-Tracer").reporter(reporter).build();
        return BraveTracer.create(braveTracer);
    }*/

    //public static void main(String[] args) {
        //ApplicationContext ctx = SpringApplication.run(Application.class, args);
   // }

    /*@Bean
    public io.opentracing.Tracer zipkinTracer() {
        OkHttpSender okHttpSender = OkHttpSender.create("http://localhost:9411/api/v1/spans");
        AsyncReporter<Span> spanReporter = AsyncReporter.builder(okHttpSender).build();
        Tracing braveTracing = Tracing.newBuilder()
                .localServiceName("my-service")
                .reporter(spanReporter)
                .build();
        return BraveTracer.create(braveTracing);
    }*/

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    public CommandLineRunner init(UserDao userDao){
        return args -> {
            User user1 = new User();
            user1.setFirstName("Devglan");
            user1.setLastName("Devglan");
            user1.setSalary(12345);
            user1.setAge(23);
            user1.setUsername("devglan");
            user1.setPassword(passwordEncoder.encode("devglan"));
            userDao.save(user1);

            User user2 = new User();
            user2.setFirstName("John");
            user2.setLastName("Doe");
            user2.setSalary(4567);
            user2.setAge(34);
            user2.setUsername("john");
            user2.setPassword(passwordEncoder.encode("john"));
            userDao.save(user2);
        };*/
    //}

}
