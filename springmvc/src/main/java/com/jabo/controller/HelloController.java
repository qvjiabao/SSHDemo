package com.jabo.controller;

import com.jabo.pojo.Books;
import com.jabo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController")
public class HelloController {

    @Autowired
    IBookService bookService;

    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/hello")
    public String sayHello(Model model) {

        Books books = bookService.queryBookById(1);

        books.setBookID(0);
        books.setBookName("qujiabao");

        bookService.addBook(books);


        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        //model.addAttribute("msg", books.getBookName());
        //web-inf/jsp/hello.jsp
        return "hello.html";
    }
}