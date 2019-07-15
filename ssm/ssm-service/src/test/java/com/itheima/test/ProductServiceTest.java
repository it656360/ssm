package com.itheima.test;

import com.itheima.ssm.domain.Product;
import com.itheima.ssm.sevice.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductServiceTest {

    @Test
    public void test() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        ProductService productService = app.getBean(ProductService.class);
        System.out.println(productService);
        List<Product> productList = productService.findAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
