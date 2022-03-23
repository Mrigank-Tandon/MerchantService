package com.example.Merchant.Repository;

import com.example.Merchant.Entity.MerchantProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantProductRepo extends CrudRepository<MerchantProduct, Integer> {
}
