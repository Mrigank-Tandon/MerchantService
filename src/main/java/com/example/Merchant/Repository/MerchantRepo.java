package com.example.Merchant.Repository;

import com.example.Merchant.Entity.Merchant;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface MerchantRepo extends CrudRepository<Merchant, Integer> {


}
