package net.croz.cxf.apachecxfdemo.config;

import jakarta.servlet.Servlet;
import jakarta.xml.ws.Endpoint;
import net.croz.cxf.apachecxfdemo.web.service.ProductServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:META-INF/cxf/cxf.xml")
public class CxfConfig {

    @Autowired
    @Qualifier("cxf")
    private Bus cxfBus;

    @Bean
    public ServletRegistrationBean<Servlet> servletRegistrationBean(ApplicationContext context) {
        return new ServletRegistrationBean<>(new CXFServlet(), "/api/*");
    }

    @Bean
    public Endpoint productService() {
        EndpointImpl endpoint = new EndpointImpl(cxfBus, new ProductServiceImpl());
        endpoint.publish("/productService");
        return endpoint;
    }

}