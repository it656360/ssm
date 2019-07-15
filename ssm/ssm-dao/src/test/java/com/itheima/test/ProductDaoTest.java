package com.itheima.test;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductDaoTest {
    @Test
    public void test1() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ProductDao bean = app.getBean(ProductDao.class);
        List<Product> productList = bean.findAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
