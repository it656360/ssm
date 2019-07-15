package com.itheima.ssm;

import com.itheima.ssm.domain.Product;
import com.itheima.ssm.sevice.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ControllerTest {
    @Test
    public void test1() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = app.getBean(ProductService.class);
        System.out.println(productService);
        List<Product> productList = productService.findAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
