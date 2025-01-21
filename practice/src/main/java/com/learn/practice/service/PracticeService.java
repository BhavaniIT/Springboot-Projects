package com.learn.practice.service;

import com.learn.practice.model.Transaction;
import com.learn.practice.repository.PracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticeService {

    @Autowired
    private PracticeRepository practiceRepository;

    public List<Transaction> getTransaction(Long customerId){
        if(customerId != null){
            return practiceRepository.findByCustomerId(customerId);
        }
        return practiceRepository.findAll();
    }
}
