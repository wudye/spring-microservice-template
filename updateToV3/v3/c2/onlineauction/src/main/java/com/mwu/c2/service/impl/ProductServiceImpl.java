package com.mwu.c2.service.impl;


import com.mwu.c2.entity.Product;
import com.mwu.c2.repository.ProductRepository;
import com.mwu.c2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product, MultipartFile file) throws IOException {
        product.setPhoto(file.getBytes());
        productRepository.save(product);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElseThrow();
    }

}
