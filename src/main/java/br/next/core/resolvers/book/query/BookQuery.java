package br.next.core.resolvers.book.query;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.next.core.model.Book;
import br.next.core.services.BookService;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class BookQuery implements GraphQLQueryResolver{
	
	private final BookService service;
	
	public Optional<Book> findBook(String isbn) {
    	return service.findBook(isbn);
    }
	
	
	public List<Book> listAll(){
		return Arrays.asList(service.findBook("someIsbn").get());
	}
}
