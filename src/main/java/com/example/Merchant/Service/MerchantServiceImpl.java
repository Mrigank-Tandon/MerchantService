package com.example.Merchant.Service;

import com.example.Merchant.Entity.Merchant;
import com.example.Merchant.Entity.MerchantProduct;
import com.example.Merchant.Repository.MerchantProductRepo;
import com.example.Merchant.Repository.MerchantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService{

    @Autowired
    private MerchantRepo merchantRepo;

    @Autowired
    private MerchantProductRepo merchantProductRepo;

    public Merchant getMerchantById(Integer id){
        Optional<Merchant> seller = merchantRepo.findById(id);
        if(seller.isPresent()){
            return new Merchant(seller.get().getId(), seller.get().getMerchantName(),seller.get().getMerchantEmail(),seller.get().getPhone(),seller.get().getPassword(), seller.get().getMerchantTotalProduct());
        }else{
            return null;
        }

    }
    public List<MerchantProduct> getAllMerchantWithSameProduct(Integer ProductId){
        Iterable<MerchantProduct> listOfMerchant = merchantProductRepo.findAll();
        List<MerchantProduct> list = new ArrayList<>();
        for(MerchantProduct merchantProduct : listOfMerchant){
            if(merchantProduct.getProductId() == ProductId){
                list.add(merchantProduct);
            }
        }

        return list;
    }
    public void addMerchant(Merchant merchant){
        merchantRepo.save(merchant);
    }
    public void updateMerchant(Merchant merchant){
        merchantRepo.save(merchant);
    }
}
