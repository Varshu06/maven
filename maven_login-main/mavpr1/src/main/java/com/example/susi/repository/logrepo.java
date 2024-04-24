package com.example.susi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.susi.domain.login;

@Repository
public interface logrepo extends JpaRepository<login,String>
{
login findbyUsernameAndPassword(String username, String password);
}