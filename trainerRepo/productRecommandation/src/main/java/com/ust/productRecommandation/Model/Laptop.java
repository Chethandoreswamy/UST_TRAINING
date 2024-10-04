package com.ust.productRecommandation.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String processor;
    private int ram; // in GB
    private String storageType; // HDD or SSD
    private int screenSize; // in inches
    private BigDecimal price;
    private double weight; // in kg

    // Getters and Setters
}
