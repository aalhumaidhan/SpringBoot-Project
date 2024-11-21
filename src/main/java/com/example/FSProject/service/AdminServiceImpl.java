package com.example.FSProject.service;

import com.example.FSProject.entity.AccountEntity;
import com.example.FSProject.entity.TransactionEntity;
import com.example.FSProject.entity.UserEntity;
import com.example.FSProject.enums.Roles;
import com.example.FSProject.repository.AccountRepository;
import com.example.FSProject.repository.TransactionRepository;
import com.example.FSProject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final UserRepository userRepository;
    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public AdminServiceImpl(UserRepository userRepository, AccountRepository accountRepository, TransactionRepository transactionRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<AccountEntity> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public AccountEntity getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAccountById(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public List<TransactionEntity> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public TransactionEntity getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTransactionById(Long id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public void assignRole(Long userId, Roles role) {
        userRepository.findById(userId).ifPresent(user -> {
            user.setRole(role);
        });
    }
}
