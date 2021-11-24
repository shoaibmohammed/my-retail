package com.shoaib.myretail.repository;

import com.shoaib.myretail.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

    Product getProductById(long id);
}