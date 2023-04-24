package com.play.jcslib.bookstore2.service.impl;

import java.util.List;
import java.util.Map;

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

    @Override
    public void insertBook(BookVo book) {
        bookMapper.insertBook(book);
    }

    @Override
    public BookVo getSelectedBook(String isbn) {
        return bookMapper.getSelectedBook(isbn);
    }

    @Override
    public void updateBook(BookVo book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void updateBookMap(Map bookMap){
        bookMapper.updateBookMap(bookMap);
    }

    @Override
    public void deleteBook(String isbn) {
        bookMapper.deleteBook(isbn);
    }
}
