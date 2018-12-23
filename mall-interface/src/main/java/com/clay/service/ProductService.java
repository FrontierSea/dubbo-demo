package com.clay.service;

import com.clay.model.Product;

public interface ProductService {
    /**
     * 根据id获取商品的所有信息
     * @param id
     * @return
     */
    Product getProductById(String id);
}
