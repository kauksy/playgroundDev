package com.play.jcslib.bookstore2.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.play.jcslib.bookstore2.vo.BookVo;

@Mapper
public interface BookMapper {

    List<BookVo> getAllBooks();

    void insertBook(BookVo book);

    BookVo getSelectedBook(String isbn);

    void deleteBook(String isbn);

    void updateBook(BookVo book);

    void updateBookMap(Map bookMap);
    
}
