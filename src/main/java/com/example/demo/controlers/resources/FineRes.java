package com.example.demo.controlers.resources;

import com.example.demo.entities.User;
import jakarta.annotation.Resource;
import java.util.Date;

@Resource
public class FineRes {
    private Long id;
    private double amount;
    private Date dueDate;
    private boolean isPaid;
    private User user;
}
