package com.tienda.api.Models;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;

public record DataProduct(
        @NotBlank
        String sku,
        @NotBlank
        String barcode,
        @NotBlank
        String title,
        String brand,
        String description,
        BigDecimal costPrice,
        BigDecimal salePrice,
        boolean available,
        String supplier,
        String category,
        BigDecimal tax
) {}