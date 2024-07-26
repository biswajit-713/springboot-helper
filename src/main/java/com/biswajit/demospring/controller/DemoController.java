package com.biswajit.demospring.controller;

import com.biswajit.demospring.error.InvalidCountException;
import com.biswajit.demospring.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private DemoService demoService;

    public DemoController(@Autowired DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/products")
    public ResponseEntity<String> getProducts(@RequestParam int count) throws InvalidCountException {
        return ResponseEntity.ok(demoService.getProducts(count));
    }
}
