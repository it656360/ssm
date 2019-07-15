package com.itheima.ssm.sevice.impl;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
            return productDao.findAll();
    }
}
