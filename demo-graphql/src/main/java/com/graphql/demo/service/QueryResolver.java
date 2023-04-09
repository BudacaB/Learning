package com.graphql.demo.service;

import com.graphql.demo.model.Product;
import com.graphql.demo.repository.ProductRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    private final ProductRepository productRepository;

    public QueryResolver(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> allProducts() {
        return productRepository.findAll();
    }

    public Product product(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}

