package com.tienda.api.Models;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="Productos")
@Entity(name="Producto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String sku;
    private String barcode;
    private String title;
    private String brand;
    private String description;
    private BigDecimal costPrice;
    private BigDecimal salePrice;
    private BigDecimal cantidad;
    private boolean available;
    private String supplier;
    private String category;
    private BigDecimal tax;

    public Producto(DataProduct dataProduct) {
        this.sku = dataProduct.sku();
        this.barcode = dataProduct.barcode();
        this.title = dataProduct.title();
        this.brand = dataProduct.brand();
        this.description = dataProduct.description();
        this.costPrice = dataProduct.cost_price();
        this.salePrice = dataProduct.sale_price();
        this.cantidad = dataProduct.cantidad();
        this.available = dataProduct.available();
        this.supplier = dataProduct.supplier();
        this.category = dataProduct.category();
        this.tax = dataProduct.tax();
    }
}
