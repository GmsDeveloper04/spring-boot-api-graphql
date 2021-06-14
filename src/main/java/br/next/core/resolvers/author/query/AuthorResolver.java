package br.next.core.resolvers.author.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.next.core.model.Author;

@Component
public class AuthorResolver implements GraphQLResolver<Author>{
	
	public String getDescricao(Author parent) {
		return parent.getFullname() + " " + parent.getEmail();
	}
	
}	
