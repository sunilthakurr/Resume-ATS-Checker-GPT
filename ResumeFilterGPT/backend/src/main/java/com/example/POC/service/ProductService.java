package com.example.POC.service;


import com.example.POC.entity.Product;
import com.example.POC.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;



    public Product saveProduct(Product product){
        return repository.save(product);
    }
//saving multiple product at single time
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Product> findByCategory(String category){
        return repository.findByCategory(category);
    }

    public List<Product> findProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product Removed !!"+id;
    }


    // catch null pointer exception if use don't provide id or id not found
    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
