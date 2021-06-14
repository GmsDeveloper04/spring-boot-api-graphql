package br.next.core.resolvers.book.query;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.next.core.model.Book;
import br.next.core.services.SomeApi;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookResolver implements GraphQLResolver<Book>{

	private final ExecutorService executor;
	private final SomeApi api;
	
	//DataFetchingEnvironment env
	public CompletableFuture<String> getCampoApiUm(Book parent) {
		
		//GET HEADERS SE PERCISO
		//GraphQLContext context =  env.getContext();
		//HttpServletRequest headers = context.getHttpServletRequest().get();
        
		//ASYNC
		return CompletableFuture.supplyAsync(() ->{
			return api.resquestApi(200l,"Response API UM");
		} ,executor);
	}

	public CompletableFuture<String> getCampoApiDois(Book parent) {
		
		//ASYNC
		return CompletableFuture.supplyAsync(() -> {
			return api.resquestApi(200l,"Response API DOIS");
		}, executor);
	}
	
	
	public String getCampoComputado(Book parent) {
		return parent.getTitle() + "-" + parent.getSubject();
	}
	
}
