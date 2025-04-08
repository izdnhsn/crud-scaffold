package com.interview.crud.controller;

import com.interview.crud.dto.ProductDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping
    public ResponseEntity<ProductDTO> createEmployee(@Valid @RequestBody ProductDTO employeeDTO) {

        ProductDTO createdProduct = new ProductDTO();
        // replace with actual service logic calls

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand("product id")
                .toUri();

        return ResponseEntity.created(location).body(createdProduct);
    }
}
