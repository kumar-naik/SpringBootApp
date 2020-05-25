package org.spring.swagger.controller;

import io.opentracing.Span;
import org.spring.swagger.bean.Product;
import org.spring.swagger.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OpenTracingController {

    /*@Autowired
    RestTemplate restTemplate;*/
    @Autowired
    io.opentracing.Tracer tracer;

    @RequestMapping(value = "/zipkinTracer", method= RequestMethod.GET)
    public String zipkinTracer(){
        //Span span = tracer.buildSpan("zipkinTracer").start();
        //span.finish();
        //span.log("zipkinTracer");
        //span.setTag("zipkin-Tracer", "zipkinTracer");

        return "Welcome OpenTracingController ";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity saveProduct(@RequestBody User user){
        System.out.println("First name : "+user.getFirstName());
        System.out.println("Last Name:"+user.getFirstName());
        return new ResponseEntity("Product saved successfully", HttpStatus.OK);
    }

    /*@GetMapping("/welcome")
    public String welcome(){
        return restTemplate.getForEntity("http://localhost:8080/zipkinTracer",String.class).getBody();
    }*/
}
