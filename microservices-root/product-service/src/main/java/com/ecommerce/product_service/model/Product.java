package com.ecommerce.product_service.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder// Enables builder pattern
@Document(value = "product")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
