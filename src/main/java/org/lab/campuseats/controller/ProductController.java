package org.lab.campuseats.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.lab.campuseats.dto.ProductRequest;
import org.lab.campuseats.dto.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @PutMapping("/{id}/publish")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ResponseEntity<ProductResponse> publish(@PathVariable Long id) {
        return ResponseEntity.ok(productService.publish(id));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id, @Valid @RequestBody ProductRequest req) {
        return ResponseEntity.ok(productService.update(id, req));
    }
}
