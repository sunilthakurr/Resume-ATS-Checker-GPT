package com.example.POC.controller;


import com.example.POC.entity.Product;
import com.example.POC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService service;


//    testing api
    @GetMapping("/welcome")
    public String welcome(){
        return "Hii welcome to testing page";
    }




    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }




    @GetMapping("/findAllProducts")
    public List<Product> displayProducts(){
        return service.getProducts();
    }
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping("/productByName/{name}")
    public List<Product> findProductByName(@PathVariable String name){
        return service.findProductByName(name);
    }
    @GetMapping("/productByCategory/{category}")
    public List<Product> findProductByCategory(@PathVariable String category){
        return service.findByCategory(category);
    }





    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }




    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
