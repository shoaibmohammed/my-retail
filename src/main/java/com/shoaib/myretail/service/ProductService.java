package com.shoaib.myretail.service;

import com.shoaib.myretail.entity.Product;
import com.shoaib.myretail.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.shoaib.myretail.remoteclient.RedskyClient.getProductName;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product findById(long id) {

        Product product = productRepository.getProductById(id);
        product.setTitle(getProductName(id));

        return product;
    }

    public Product updatePriceById(Product product) {
        return productRepository.save(product);
    }
}
