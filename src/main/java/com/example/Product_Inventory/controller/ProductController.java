package com.example.Product_Inventory.controller;

import com.example.Product_Inventory.entity.Product;
import com.example.Product_Inventory.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

private final ProductService service;

public ProductController(ProductService service){
    this.service=service;
}

@PostMapping
public Product add(@RequestBody Product product){
return service.addProduct(product);
}

@GetMapping
public List<Product>getAll(){
    return service.getAllProducts();
}

@GetMapping("/{id}")
public Product getById(@PathVariable Integer id){
return service.getProductById(id);
}

@PutMapping("/{id}")
public Product update(@PathVariable Integer id ,@RequestBody Product product){
    return service.updateProduct(id,product);
}

@DeleteMapping("/{id}")
public String delete(@PathVariable Integer id){
boolean removed = service.deleteProduct(id);
return removed ? "Product Removed" :"Product Not Found";
 }
}
