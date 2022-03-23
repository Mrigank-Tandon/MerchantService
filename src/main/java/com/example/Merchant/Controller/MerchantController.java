package com.example.Merchant.Controller;

import com.example.Merchant.Entity.Merchant;
import com.example.Merchant.Entity.MerchantProduct;
import com.example.Merchant.Service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/merchant")
@CrossOrigin
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @GetMapping(value = "/getMerchantById")
    public Merchant getSellerById(@RequestParam Integer id){
        return merchantService.getMerchantById(id);
    }

    @PostMapping(value = "/addMerchant")
    public void addSeller(@RequestBody @Valid Merchant merchant){
        merchantService.addMerchant(merchant);
    }

    @GetMapping(value = "/merchantWithSameProd")
    public List<MerchantProduct> SellerWitSameProd(@RequestParam Integer ProductId){
        return merchantService.getAllMerchantWithSameProduct(ProductId);
    }

    @PutMapping(value = "/updateMerchant")
    public void updateSeller(@RequestBody Merchant merchant){
        merchantService.updateMerchant(merchant);
    }
}
