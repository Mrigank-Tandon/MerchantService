package com.example.Merchant.Entity;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "Merchant")
public class Merchant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Integer id;

    @NotBlank(message="Merchant name cannot be empty")
    private String MerchantName;
    private String MerchantEmail;
    private Integer Phone;
    private String Password;
    private Integer MerchantTotalProduct;

    public Merchant(Integer id, @NotBlank(message = "Student name cannot be empty") String merchantName, String merchantEmail, Integer phone, String password, Integer merchantTotalProduct) {
        this.id = id;
        MerchantName = merchantName;
        MerchantEmail = merchantEmail;
        Phone = phone;
        Password = password;
        MerchantTotalProduct = merchantTotalProduct;
    }


    public Merchant() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
    }

    public String getMerchantEmail() {
        return MerchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        MerchantEmail = merchantEmail;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getMerchantTotalProduct() {
        return MerchantTotalProduct;
    }

    public void setMerchantTotalProduct(Integer merchantTotalProduct) {
        MerchantTotalProduct = merchantTotalProduct;
    }
}
