package net.croz.cxf.apachecxfdemo.web.service;

import jakarta.jws.WebService;
import net.croz.cxf.apachecxfdemo.dao.ProductDao;
import net.croz.cxf.apachecxfdemo.model.Product;

import java.util.List;

@WebService(endpointInterface = "net.croz.cxf.apachecxfdemo.web.service.ProductService", serviceName = "productService")
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
