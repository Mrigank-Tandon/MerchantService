package com.example.Merchant.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MerchantProduct")
public class MerchantProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Integer MerchantId;
    private Integer ProductId;
    private Integer ProductPrice;
    private Integer Quantity;

    public MerchantProduct(Integer merchantId, Integer productId, Integer productPrice, Integer quantity) {
        MerchantId = merchantId;
        ProductId = productId;
        ProductPrice = productPrice;
        Quantity = quantity;
    }

    public MerchantProduct() {
    }

    public Integer getMerchantId() {
        return MerchantId;
    }

    public void setMerchantId(Integer merchantId) {
        MerchantId = merchantId;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        ProductId = productId;
    }

    public Integer getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Integer productPrice) {
        ProductPrice = productPrice;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}
