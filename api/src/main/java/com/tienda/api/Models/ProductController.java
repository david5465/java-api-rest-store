package com.tienda.api.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @PostMapping
    public void registrarProducto(@RequestBody DataProduct DataProduct){
        productRepository.save(new Producto(DataProduct));
    }
    
}
