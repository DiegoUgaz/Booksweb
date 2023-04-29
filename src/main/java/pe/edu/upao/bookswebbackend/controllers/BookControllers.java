package pe.edu.upao.bookswebbackend.controllers;

import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upao.bookswebbackend.Services.BookService;
import pe.edu.upao.bookswebbackend.models.Book;

public class BookControllers {

    public BookService bookService;

    @Autowired
    Session session = null;
    public void addBook(){
        Book book = new Book();
        BookService.addBook(book);
    }

}
