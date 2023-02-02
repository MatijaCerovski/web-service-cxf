package net.croz.cxf.apachecxfdemo.web.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import net.croz.cxf.apachecxfdemo.model.Product;

import java.util.List;

@WebService
public interface ProductService {

    @WebMethod
    public List<Product> getAllProducts();

    @WebMethod
    public Product getProduct(@WebParam(name = "productId") int productId);

}
