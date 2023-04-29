package pe.edu.upao.bookswebbackend.Services;

import pe.edu.upao.bookswebbackend.models.Book;
import pe.edu.upao.bookswebbackend.repositories.BookRepository;

public class BookService {

    public BookRepository bookRepository;
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
