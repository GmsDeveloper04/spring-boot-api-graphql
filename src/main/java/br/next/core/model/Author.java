package br.next.core.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Author {

    private Long id;
    private String fullname;
    private String email;
    private List<Book> books;
    
    public Author(){
    	this.books = new ArrayList<>();
    }
}
