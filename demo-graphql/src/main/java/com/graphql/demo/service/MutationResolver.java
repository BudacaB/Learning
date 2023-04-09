package com.graphql.demo.service;

import com.graphql.demo.model.Product;
import com.graphql.demo.repository.ProductRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {
    private final ProductRepository productRepository;

    public MutationResolver(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(String name, double price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        return productRepository.save(product);
    }

    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}