package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	ProductInfoRepository productInfoRepository;

	@PostMapping("/post")
	ResponseEntity<ProductInfo> postProduct(@RequestBody ProductInfo productInfo) {
		productInfoRepository.save(productInfo);
		return new ResponseEntity<>(productInfo, HttpStatus.OK);
	}

	@GetMapping("/get")
	ResponseEntity<Iterable<ProductInfo>> getAllProducts() {
		return new ResponseEntity<>(productInfoRepository.findAll(), HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
