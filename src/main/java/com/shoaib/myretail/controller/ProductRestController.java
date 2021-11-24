package com.shoaib.myretail.controller;

import com.shoaib.myretail.entity.Product;
import com.shoaib.myretail.exception.ProductNotFoundException;
import com.shoaib.myretail.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/data/v1/products")
@RestController
public class ProductRestController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> getProductDetails(@PathVariable("id") long productId) {

        Product product;
        try {
            product = productService.findById(productId);
        } catch (Exception e) {
            throw new ProductNotFoundException();
        }

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Product> modifyPrice(@RequestBody Product product, @PathVariable("id") long id) {

        if (id != product.getId()) {
            return new ResponseEntity<>(product, HttpStatus.BAD_REQUEST);
        }

        try{
            productService.updatePriceById(product);
        } catch (Exception e) {
            throw new ProductNotFoundException();
        }
        return new ResponseEntity<>(productService.updatePriceById(product), HttpStatus.OK);

    }
}
