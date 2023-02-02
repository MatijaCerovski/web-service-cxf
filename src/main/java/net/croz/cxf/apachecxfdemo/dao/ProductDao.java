package net.croz.cxf.apachecxfdemo.dao;

import net.croz.cxf.apachecxfdemo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    List<Product> productList = new ArrayList<>();

    public ProductDao() {
        Product p1 = new Product(101, "Laptop", "Electronics");
        Product p2 = new Product(102, "Bannana", "Fruits");
        Product p3 = new Product(103, "Pencil", "Stationary");
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
    }

    public Product getProduct(int id) {
        for (Product product : productList) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return productList;
    }

}
