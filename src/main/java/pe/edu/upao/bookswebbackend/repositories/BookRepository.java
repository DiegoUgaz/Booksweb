package pe.edu.upao.bookswebbackend.repositories;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upao.bookswebbackend.models.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    @Autowired Session session;

    public void save(Book book) {

        session.save(book);


    }

    public void list(){
        session.createQuery("select b from Book b").list();
        }

    }

