package com.tjh.demo8;

import javax.annotation.Resource;

public class ProductService {

    @Resource(name="categorydao")
    private CategoryDao categoryDao;

    @Resource(name="productdao")
    private ProductDao productDao;

    public void save(){
        System.out.println("ProductService的save执行");
    }

//    public void setCategoryDao(CategoryDao categoryDao) {
//        this.categoryDao = categoryDao;
//    }
//
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }
}
