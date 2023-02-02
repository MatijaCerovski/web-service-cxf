package net.cerovski.cxf.cxfdemo.web.service;

import jakarta.jws.WebService;
import net.cerovski.cxf.cxfdemo.dao.ProductDao;
import net.cerovski.cxf.cxfdemo.model.Product;

import java.util.List;

@WebService(endpointInterface = "net.cerovski.cxf.cxfdemo.web.service.ProductService", serviceName = "productService")
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    public ProductServiceImpl() {
        productDao = new ProductDao();
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public Product getProduct(int productId) {
        return productDao.getProduct(productId);
    }
}
