package com.springbootWeb.WebApp.service;

import com.springbootWeb.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone", 50000),
            new Product(102,"CMF Phone 2 PRO", 25000),
            new Product(103,"Samsung ZFold", 70000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        for(Product item : products){
            if(item.getProdId() == prod.getProdId()){
                products.set(products.indexOf(item), prod);
                break;
            }
        }
    }

    public void deleteProduct(int prodId) {
        for(Product item : products){
            if(item.getProdId() == prodId){
                products.remove(item);
                break;
            }
        }
    }
}

