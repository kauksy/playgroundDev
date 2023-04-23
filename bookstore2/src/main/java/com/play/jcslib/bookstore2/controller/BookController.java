package com.play.jcslib.bookstore2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.play.jcslib.bookstore2.service.BookService;
import com.play.jcslib.bookstore2.vo.BookVo;

import ch.qos.logback.core.read.ListAppender;

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

    @GetMapping("deletebook")
    @RequestMapping(value= "/deletebook")
    public String deletebook(@ModelAttribute("isbn") String isbn){
        bookService.deleteBook(isbn);
        return "redirect:/index";
    }

// 현재페이지에서 받아서 뭔가하고싶을때 ajax, url로 넘기고 싶은거는 뷰를 받는 컨트롤러를 따로 만들어야함
// 폼은 짐싸들고 가는거 얘는 폼으로 바꾸는게 적합하다!
    @PostMapping("bookdetail")
    @RequestMapping(value= "/bookdetail")
    public String bookdetail (@RequestParam("isbn") String isbn, Model model){
        System.out.println(">>>>>>> bookdetail");
        BookVo book = bookService.getSelectedBook(isbn);
        model.addAttribute("book", book); // html을 부르는거니까, 얘를 빼고.. 뷰를 받는 컨트롤러를 하나더 만들던가 폼으로 넘기던가
        return "book/bookdetail";
    }

    @PostMapping("modifybook")
    @RequestMapping(value= "/modifybook")
    public String modifybook(@RequestParam("book_id") String isbn, Model model){
        System.out.println(">>>>>>> modifybook");
        System.out.println("model =>" + model);
        System.out.println("isbn =>" + isbn);
        BookVo book = bookService.getSelectedBook(isbn);
        model.addAttribute("book", book);
        return "book/modifybook";
    }

}


/*
 * form으로 데이터 받아오기, 업데이트(수정) 페이지 완성해보기
 */