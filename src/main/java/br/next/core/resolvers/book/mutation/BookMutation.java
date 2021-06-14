package br.next.core.resolvers.book.mutation;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.next.core.model.Author;
import br.next.core.model.Book;

@Component
public class BookMutation implements GraphQLMutationResolver {
	
	 public Book createBook(Book book, String email) {
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
	    	meuLivro.setTitle("Sem sentido");
	    
	    	return meuLivro;
	    }
}
