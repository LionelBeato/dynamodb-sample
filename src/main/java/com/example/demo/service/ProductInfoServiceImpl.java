package com.example.demo.service;

import com.example.demo.model.ProductInfo;
import com.example.demo.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    ProductInfoRepository repository;

    @Override
    public Iterable<ProductInfo> getAllProductInfo() {
        return repository.findAll();
    }

    @Override
    public Optional<ProductInfo> getProductById(String id) {
        return repository.findById(id);
    }

    @Override
    public void postProductInfo(ProductInfo productInfo) {
        repository.save(productInfo);
    }
}
