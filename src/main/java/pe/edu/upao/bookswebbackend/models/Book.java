package pe.edu.upao.bookswebbackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name= "books")
public class Book {
    Integer id;
    String title;
    String description;
    @Column(name = "created_at")
    LocalDateTime createdAt;
}
