package com.learn.practice.controller;

import com.learn.practice.model.Transaction;
import com.learn.practice.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class PracticeController {
    @Autowired
    private PracticeService practiceService;

    @GetMapping
    public List<Transaction> getTransaction(
            @RequestParam(required = false) Long customerId,
            @RequestParam(defaultValue = "0")int page,
            @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page, size);
        return practiceService.getTransaction(customerId);
    }
}
