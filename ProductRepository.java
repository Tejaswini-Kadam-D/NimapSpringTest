package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

	Optional<Product> findById(Long id);

}
