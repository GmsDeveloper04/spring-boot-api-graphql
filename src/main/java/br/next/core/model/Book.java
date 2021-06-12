package br.next.core.model;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Data;

@Data
public class Book {
 
	private Long id;
    private String isbn;
    private String title;
    private String subject;
    private Author author;
    private LocalDate createdAt = LocalDate.now();
    private boolean active = true;
    private String chiclete;
    
    public Book() {
    	this.isbn = UUID.randomUUID().toString();
    }
}