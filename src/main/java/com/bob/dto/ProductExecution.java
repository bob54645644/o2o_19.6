package com.bob.dto;

import com.bob.entity.Product;
import com.bob.enums.ProductStateEnum;

import java.util.List;

/**product
 * productList
 * count
 * @author bob
 * @date 2019/6/18 0:22
 */
public class ProductExecution {
    private int state;
    private String info;
    private Product product;
    private List<Product> productList;
    private int count;

    public ProductExecution() {
    }

    public ProductExecution(ProductStateEnum stateEnum) {
        this.state =stateEnum.getState();
        this.info = stateEnum.getInfo();
    }

    public ProductExecution(ProductStateEnum stateEnum, Product product) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.product = product;
    }

    public ProductExecution(ProductStateEnum stateEnum, List<Product> productList, int count) {
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.productList = productList;
        this.count = count;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
