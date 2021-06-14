package br.next.core.resolvers.book.query;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.next.core.model.Author;
import br.next.core.model.Book;

@Component
public class BookQuery implements GraphQLQueryResolver{
	public Optional<Book> findBook(String isbn) {
    	Author guilherme = new Author();
    	guilherme.setEmail("gmsdev04@icloud.com");
    	guilherme.setFullname("Guilherme Maciel Siqueira");
    	guilherme.setId(1L);
    	
    	Book meuLivro = new Book();
    	meuLivro.setActive(true);
    	meuLivro.setAuthor(guilherme);
    	meuLivro.setCreatedAt(LocalDate.now());
    	meuLivro.setId(1L);
    	meuLivro.setSubject("A volta dos que não foram");
    	meuLivro.setTitle("Algum titulo");
    	
    	return Optional.of(meuLivro);
    }
}
