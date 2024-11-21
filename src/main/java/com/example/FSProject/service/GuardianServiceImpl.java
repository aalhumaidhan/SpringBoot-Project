package com.example.FSProject.service;

import com.example.FSProject.bo.TransferRequest;
import com.example.FSProject.entity.AccountEntity;
import com.example.FSProject.entity.TransactionEntity;
import com.example.FSProject.entity.UserEntity;
import com.example.FSProject.repository.AccountRepository;
import com.example.FSProject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GuardianServiceImpl implements GuardianService {

    private final UserRepository userRepository;

    public GuardianServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserEntity user;

    @Override
    public TransactionEntity transfer(TransferRequest transferRequest) {


    }
}
