package com.example.Product_Inventory.service;

import com.example.Product_Inventory.entity.Product;
import com.example.Product_Inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public final ProductRepository repo;

    public ProductService(ProductRepository repo) {
    this.repo = repo;
    }

    public Product addProduct(Product product){
        return repo.save(product);
    }

    public List<Product>getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(Integer id){
    return repo.findById(id).orElse(null);
    }

    public Product updateProduct(Integer id,Product UpdateProduct){
        Product existing = repo.findById(id).orElse(null);
        if (existing == null) {
            return null;
        }
        existing.setName(UpdateProduct.getName());
        existing.setPrice(UpdateProduct.getPrice());
        existing.setQuantity(UpdateProduct.getQuantity());

        return repo.save(existing);
    }

    public boolean deleteProduct(Integer id){
        if(!repo.existsById(id)) {
            return false;
        }
            repo.deleteById(id);
            return true;

    }
}
