package com.example.susi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.susi.domain.login;
import com.example.susi.repository.logrepo;
@Service
public class logservice {
    @Autowired

    private logrepo rep;
    public login log(String username, String password)
    {
        login use=rep.findbyUsernameAndPassword(username, password);
        return use;
    }
    
    
    

}
