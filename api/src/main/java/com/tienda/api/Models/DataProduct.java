package com.tienda.api.Models;

import java.math.BigDecimal;

public record DataProduct(
        String title,
        String brand,
        String description,
        BigDecimal costPrice,
        BigDecimal salePrice,
        String barcode,
        boolean available,
        String supplier,
        String category,
        BigDecimal tax
) {}