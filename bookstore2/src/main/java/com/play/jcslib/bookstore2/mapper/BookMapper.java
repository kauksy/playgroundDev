package com.play.jcslib.bookstore2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.play.jcslib.bookstore2.vo.BookVo;

@Mapper
public interface BookMapper {

    List<BookVo> getAllBooks();

    
}