package org.example.app.service;

import org.example.app.exceptions.ProductNotFoundException;
import org.example.app.port.in.ProductService;
import org.example.app.port.out.ProductRepository;
import org.example.domain.model.Product;
import org.example.domain.model.valueObjects.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> getProductById(Id id) {
        return productRepository.findById(id);
    }

    @Override
    public Product createProduct(Product product) {
        if (!productRepository.existsById(product.getId())) throw new ProductNotFoundException(String.valueOf(product.getId()));
        productRepository.save(product);
        return product;
    }

    @Override
    public void updateProduct(Product product) {
        if (!productRepository.existsById(product.getId())) throw new ProductNotFoundException(String.valueOf(product.getId()));
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Id id) {
        if (!productRepository.existsById(id)) throw new ProductNotFoundException(String.valueOf(id));
        productRepository.deleteById(id);
    }
}
