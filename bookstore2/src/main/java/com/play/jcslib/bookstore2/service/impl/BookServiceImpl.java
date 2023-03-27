package com.play.jcslib.bookstore2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.play.jcslib.bookstore2.mapper.BookMapper;
import com.play.jcslib.bookstore2.service.BookService;
import com.play.jcslib.bookstore2.vo.BookVo;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    
    @Override
    public List<BookVo> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}