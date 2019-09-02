package com.pipeline.root.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.pipeline.root.models.Contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
@RestController
public class ContactController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/contacts")
    public String getContacts() {
        return "Eric";
        // return new Contact(counter.incrementAndGet(), String.format(template, name));
    }

    // @Override
    // public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // registry
    // .addResourceHandler("/files/**")
    // .addResourceLocations("file:/resources/test.json");
    // }
}