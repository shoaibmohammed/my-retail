package com.shoaib.myretail.service;

import com.shoaib.myretail.entity.Product;
import com.shoaib.myretail.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class MongoDbService {

    @Autowired
    ProductRepository productRepository;

    public MongoDbService() {
    }

    /**
     * Populate data after initialize the application.
     */
    @PostConstruct
    public void init() {
        addProducts();
    }

    private void addProducts() {
        if (productRepository != null) {
            final Map<String, String> current_price1 = new HashMap<>();
            current_price1.put("value", "10.25");
            current_price1.put("currency_code", "USD");

            final Map<String, String> current_price2 = new HashMap<>();
            current_price1.put("value", "21.00");
            current_price1.put("currency_code", "USD");

            final Map<String, String> current_price3 = new HashMap<>();
            current_price1.put("value", "33.99");
            current_price1.put("currency_code", "CAD");

            final Map<String, String> current_price4 = new HashMap<>();
            current_price1.put("value", "1225.49");
            current_price1.put("currency_code", "INR");

            Product product1 = new Product(13860428, current_price1);
            Product product2 = new Product(54456119, current_price2);
            Product product3 = new Product(13264003, current_price3);
            Product product4 = new Product(12954218, current_price4);

            productRepository.deleteAll();

            productRepository.saveAll(Arrays.asList(product1, product2, product3, product4));
        }
    }

}
