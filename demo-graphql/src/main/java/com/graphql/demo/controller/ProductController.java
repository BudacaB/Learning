package com.graphql.demo.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final RestTemplate restTemplate;
    private final String graphqlEndpoint = "http://localhost:8080/graphql";

    public ProductController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping
    public ResponseEntity<String> getAllProducts() {
        String query = "{ \"query\": \"{ allProducts { id name price } }\" }";
        return executeRequest(query);
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestParam String name, @RequestParam double price) {
        String mutation = String.format("{ \"query\": \"mutation { createProduct(name: \\\"%s\\\", price: %f) { id name price } }\" }", name, price);
        return executeRequest(mutation);
    }

    private ResponseEntity<String> executeRequest(String payload) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(payload, headers);
        return restTemplate.exchange(graphqlEndpoint, HttpMethod.POST, entity, String.class);
    }
}
