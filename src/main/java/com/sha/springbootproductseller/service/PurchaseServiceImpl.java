package com.sha.springbootproductseller.service;

import com.sha.springbootproductseller.model.Purchase;
import com.sha.springbootproductseller.repository.PurchaseRepository;
import com.sha.springbootproductseller.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemOfUser(Long userId){
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }


}
