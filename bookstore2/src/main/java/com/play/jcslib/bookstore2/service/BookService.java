package com.play.jcslib.bookstore2.service;

import java.util.List;
import java.util.Map;

import com.play.jcslib.bookstore2.vo.BookVo;

public interface BookService {

    public List<BookVo> getAllBooks();

    public void insertBook(BookVo book);

    public BookVo getSelectedBook(String isbn);

    public void deleteBook(String isbn);

    public void updateBook(BookVo book);

    public void updateBookMap(Map bookMap);
    
}
