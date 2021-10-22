package com.example.catalogservice.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;


public interface CatalogRepository extends CrudRepository<CatalogEntity,Long> {
    CatalogEntity findByProductId(String productId);
}
