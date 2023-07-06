package com.devsuperior.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Product(Long id, String name, double price, Department department) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Department getDepartment() {
        return department;
    }
}
