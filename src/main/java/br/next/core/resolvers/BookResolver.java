package br.next.core.resolvers;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.next.core.model.Book;

@Component
public class BookResolver implements GraphQLResolver<Book>{
	public String getChiclete(Book parent) {
		return "Push";
	}
}
