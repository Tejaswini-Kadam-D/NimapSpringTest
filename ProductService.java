package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.Entity.Product;
import com.example.Repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Iterable<? extends Product> id) {
        productRepository.deleteAll(id);
    }

	public Object updateProduct(Long id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Product> getallproduct(PageRequest of) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getallproduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
}
