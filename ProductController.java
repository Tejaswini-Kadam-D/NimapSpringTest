package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Product;
import com.example.IService.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	
    @Autowired
    private IProductService productService;
    
   
    @GetMapping("/getallprod")
    public Page<Product> getAllProducts(
            @RequestParam(value = "page", defaultValue = "0") int page,   
            @RequestParam(value = "size", defaultValue = "10") int size) 
    {
       
        PageRequest pageRequest = PageRequest.of(page, size);
        
        
        return productService.getallproduct(pageRequest);
    }
    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product) {
    	System.out.println(product);
        return productService.addProduct(product);
    }
    
   
    @PutMapping("/updateproduct/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }
    
  
    @DeleteMapping("/deleteproduct/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
    
   
    @GetMapping("/getproductbyid/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductbyid(id);
    }
}
