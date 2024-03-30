package com.tienda.api.Models;

import java.math.BigDecimal;

public record DataProduct(
        String sku,
        String barcode,
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