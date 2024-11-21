package com.example.FSProject.service;

import com.example.FSProject.entity.AccountEntity;
import com.example.FSProject.entity.TransactionEntity;
import com.example.FSProject.entity.UserEntity;
import com.example.FSProject.enums.Roles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<UserEntity> getAllUsers();
    UserEntity getUserById(Long id);
    void deleteUserById(Long id);
    List<AccountEntity> getAllAccounts();
    AccountEntity getAccountById(Long id);
    void deleteAccountById(Long id);
    List<TransactionEntity> getAllTransactions();
    TransactionEntity getTransactionById(Long id);
    void deleteTransactionById(Long id);
    void assignRole(Long userId, Roles role);
}
