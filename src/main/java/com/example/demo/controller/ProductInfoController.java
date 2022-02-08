package com.example.demo.controller;

import com.example.demo.model.ProductInfo;
import com.example.demo.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product/")
public class ProductInfoController {

    @Autowired
    ProductInfoService productInfoService;

    @PostMapping("/post")
    ResponseEntity<ProductInfo> postProduct(@RequestBody ProductInfo productInfo) {
        productInfoService.postProductInfo(productInfo);
        return new ResponseEntity<>(productInfo, HttpStatus.OK);
    }

    @GetMapping("/get")
    ResponseEntity<Iterable<ProductInfo>> getAllProducts() {
        return new ResponseEntity<>(productInfoService.getAllProductInfo(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    ResponseEntity<Optional<ProductInfo>> getProductById(@PathVariable String id) {
        return new ResponseEntity<>(productInfoService.getProductById(id), HttpStatus.OK);
    }

}
