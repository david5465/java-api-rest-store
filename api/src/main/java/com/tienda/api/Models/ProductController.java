package com.tienda.api.Models;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductController {
    @PostMapping
    public void registrarProducto(@RequestBody DataProduct DataProduct){
        System.out.println("Request llega");
        System.out.println(DataProduct);
    }
    
}
