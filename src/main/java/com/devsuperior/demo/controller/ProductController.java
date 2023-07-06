package com.devsuperior.demo.controller;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Product;
import com.devsuperior.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping
    public List<Product> getProducts() {

        List<Product> products = productRepository.findAll();
        return products;
    }
}
