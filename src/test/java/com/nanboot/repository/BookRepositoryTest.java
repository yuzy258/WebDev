package com.nanboot.repository;

import com.nanboot.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;
    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());

    }
    @Test
    void save(){
        Book book  =new Book();
        book.setAuthor("张三");
        book.setName("罗翔的医生");
        Book book1 =bookRepository.save(book);
        System.out.println(book1);
    }
    @Test
    void findById(){
        Book book= bookRepository.findById(1).get();
        System.out.println(book);
    }
    @Test
    void update(){
        Book book =new Book();
        book.setId(11);
        book.setName("于的测试");
        Book book1= bookRepository.save(book);
        System.out.println(book1);
    }
}