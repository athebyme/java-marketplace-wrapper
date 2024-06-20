package org.example.app.port.out;

import org.example.domain.model.Product;
import org.example.domain.model.valueObjects.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Id> {
    Optional<Product> findById(@NonNull Id id);
    Product save(@NonNull Product product);
    void deleteById(@NonNull Id id);
}