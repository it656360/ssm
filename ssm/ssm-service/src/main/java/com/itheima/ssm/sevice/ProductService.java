package com.itheima.ssm.sevice;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll() throws Exception;
}
