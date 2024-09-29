package ca.gbc.productservices.service;

import ca.gbc.productservices.dto.ProductRequest;
import ca.gbc.productservices.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest productRequest);
    List<ProductResponse> getALLProducts();
    String updateProduct(String id, ProductRequest productRequest);
    void deleteProduct(String id);
}
