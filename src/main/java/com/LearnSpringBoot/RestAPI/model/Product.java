package com.LearnSpringBoot.RestAPI.model;

import jakarta.persistence.*;



public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;
    private int years;
    private Double price;
    private  String url;
    public Product() {}
    public Product(String productName, int years, Double price, String url) {

        this.productName = productName;
        this.years = years;
        this.price = price;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getYear() {
        return years;
    }

    public void setYear(int year) {
        this.years = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", year=" + years +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
