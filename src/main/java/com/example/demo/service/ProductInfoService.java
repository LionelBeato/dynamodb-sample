package com.example.demo.service;

import com.example.demo.model.ProductInfo;

import java.util.Optional;

public interface ProductInfoService {

    // get
    Iterable<ProductInfo> getAllProductInfo();

    Optional<ProductInfo> getProductById(String id);

    // post
    void postProductInfo(ProductInfo productInfo);


}
