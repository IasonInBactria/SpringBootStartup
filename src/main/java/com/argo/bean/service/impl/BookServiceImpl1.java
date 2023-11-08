package com.argo.bean.service.impl;

import com.argo.bean.service.BookService;

public class BookServiceImpl1 implements BookService {
    @Override
    public void check() {
        System.out.println("book service 1...");
    }
}
