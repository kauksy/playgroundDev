package com.play.jcslib.bookstore2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.play.jcslib.bookstore2.service.BookService;
import com.play.jcslib.bookstore2.vo.BookVo;

@Controller
@RequestMapping("/")
public class BookController {
    
    @Autowired
    private BookService bookService;
     
    /**
     * /index url로 접속하면
     * temlplates > book 하위에 있는 index.html의 화면이 수행 됨
     * book/index
     **/
    @RequestMapping(value= "/index")
    public String index(Model model){
        List<BookVo> bookList = bookService.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "book/index";
    }

    /**
     * /makebookform url로 접속하면 (book/index의 버튼을 클릭하면 /makebookform 으러 넘어감)
     * temlplates > book 하위에 있는 makebookform.html의 화면이 수행 됨
     * book/makebookform
     **/
    @RequestMapping(value= "/makebookform")
    public String makebookform(Model model){

        return "book/makebookform";
    }

    @RequestMapping(value= "/insertbook")
    public String insertform(BookVo book){
        bookService.insertBook(book);
        return "redirect:/index";
    }

    @GetMapping("bookdetail")
    @RequestMapping(value= "/bookdetail")
    public String bookdetail (@ModelAttribute("isbn") String isbn, Model model){
        BookVo book = bookService.getSelectedBook(isbn);
        model.addAttribute("book", book);
        return "book/bookdetail";
    }

    
    @RequestMapping(value= "/modifybook")
    public String modifybook(BookVo book, Model model){
        System.out.println(">>>>>>> modifybook");
        
        return "book/modifybook";
    }

}
