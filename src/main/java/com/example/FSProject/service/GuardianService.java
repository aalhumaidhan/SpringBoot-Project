package com.example.FSProject.service;

import com.example.FSProject.bo.TransferRequest;
import com.example.FSProject.entity.AccountEntity;
import com.example.FSProject.entity.TransactionEntity;
import org.springframework.stereotype.Service;

@Service
public interface GuardianService {
    TransactionEntity transfer(TransferRequest transferRequest);
}
