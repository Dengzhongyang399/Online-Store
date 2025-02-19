package com.example.onlinestore.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CreateProductRequest {
    @NotBlank(message = "error.product.name.empty")
    private String name;

    @NotBlank(message = "error.product.category.empty")
    private String category;

    @NotNull(message = "error.product.price.empty")
    @DecimalMin(value = "0.01", message = "error.product.price.min")
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
} 