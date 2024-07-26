package com.biswajit.demospring.service;

import com.biswajit.demospring.error.InvalidCountException;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getProducts(int count) throws InvalidCountException {
        if (count == 0) {
            throw new InvalidCountException("Count cannot be 0");
        }
        return "Products";
    }
}

