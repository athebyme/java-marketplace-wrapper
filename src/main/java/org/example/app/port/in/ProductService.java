package org.example.app.port.in;

import org.example.domain.model.Product;
import org.example.domain.model.valueObjects.Id;

import java.util.Optional;

public interface ProductService {
    Optional<Product> getProductById(Id id);
    Product createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Id id);
}
