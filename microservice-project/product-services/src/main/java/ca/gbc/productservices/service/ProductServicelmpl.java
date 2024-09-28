package ca.gbc.productservices.service;

import ca.gbc.productservices.dto.ProductRequest;
import ca.gbc.productservices.dto.ProductResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServicelmpl implements ProductService{
    @Override
    public ProductResponse createProduct(ProductRequest productRequest) {
        return null;
    }

    @Override
    public List<ProductResponse> getALLProducts() {
        return List.of();
    }

    @Override
    public String updateProduct(String productId, ProductRequest productRequest) {
        return "";
    }

    @Override
    public void deleteProduct(String productId) {

    }
}
