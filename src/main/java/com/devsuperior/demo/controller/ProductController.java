package com.devsuperior.demo.controller;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public static List<Product> getProducts() {
        Department department1 = new Department(1L, "Tech");
        Department department2 = new Department(2L, "Pet");
        Product product1 = new Product(1L, "Mackbook Pro", 4_000, department1);
        Product product2 = new Product(2L, "PC Gamer", 5_000, department1);
        Product product3 = new Product(3L, "Pet House", 300, department2);
        List<Product> products = List.of(product1, product2, product3);
        return products;
    }
}
