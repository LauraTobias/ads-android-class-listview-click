package com.example.click.model;

import java.math.BigDecimal;

public class Fruit {

    private static int countCode = 15151;

    private String name;
    private String description;
    private int image;
    private BigDecimal price;
    private BigDecimal salePrice;
    private int reviewsQuantity;
    private BigDecimal reviews;
    private int code;

    public Fruit(String name, String description, int image, BigDecimal price, BigDecimal salePrice, int reviewsQuantity, BigDecimal reviews) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.salePrice = salePrice;
        this.reviewsQuantity = reviewsQuantity;
        this.reviews = new BigDecimal(4.5);
        this.code = countCode;
        countCode++;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getImage() { return image; }

    public void setImage(int image) { this.image = image; }

    public BigDecimal getPrice() { return price; }

    public void setPrice(BigDecimal price) { this.price = price; }

    public BigDecimal getSalePrice() { return salePrice; }

    public void setSalePrice(BigDecimal salePrice) { this.salePrice = salePrice; }

    public int getReviewsQuantity() { return reviewsQuantity; }

    public void setReviewsQuantity(int reviewsQuantity) { this.reviewsQuantity = reviewsQuantity; }

    public BigDecimal getReviews() { return reviews; }

    public void setReviews(BigDecimal reviews) { this.reviews = reviews; }

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }
}