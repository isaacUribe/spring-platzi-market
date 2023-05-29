package com.example.platzymarket.domain.repository;

import com.example.platzymarket.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int catagoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct (int productId);
    Product save (Product product);
    void delete(int productId);

}
