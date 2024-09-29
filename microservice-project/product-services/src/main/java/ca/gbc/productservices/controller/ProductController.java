package ca.gbc.productservices.controller;


import ca.gbc.productservices.dto.ProductRequest;
import ca.gbc.productservices.dto.ProductResponse;
import ca.gbc.productservices.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getALLProducts();
    }

    //http://localhost:8080/api/product/exampel
    @PutMapping
    //@ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> updateProduct(@PathVariable("productId") String productId,
                                           @RequestBody ProductRequest productRequest){

        String updatedProductId = productService.updateProduct(productId, productRequest);

        //set the location header attribute
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/product/" + updatedProductId);

        return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@PathVariable("productId") String productId){

        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
