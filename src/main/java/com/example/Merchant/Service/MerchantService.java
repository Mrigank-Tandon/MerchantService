package com.example.Merchant.Service;


import com.example.Merchant.Entity.Merchant;
import com.example.Merchant.Entity.MerchantProduct;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MerchantService {
    Merchant getMerchantById(Integer id);
    List<MerchantProduct> getAllMerchantWithSameProduct(Integer ProductId);
//    Product getProductOfGivenMerchant();
    void addMerchant(Merchant merchant);
    void updateMerchant(Merchant merchant);
}
