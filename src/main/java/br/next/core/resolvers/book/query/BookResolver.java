package br.next.core.resolvers.book.query;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.next.core.model.Book;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookResolver implements GraphQLResolver<Book>{

	private final ExecutorService executor;
	
	//DataFetchingEnvironment env
	public CompletableFuture<String> getCampoApiUm(Book parent) {
		
		//GET HEADERS SE PERCISO
		//GraphQLContext context =  env.getContext();
		//HttpServletRequest headers = context.getHttpServletRequest().get();
        
		//ASYNC
		return CompletableFuture.supplyAsync(() ->{
			try {
				Thread.sleep(200l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Um";
		} ,executor);
	}

	public CompletableFuture<String> getCampoApiDois(Book parent) {
		
		//ASYNC
		return CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(200l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Dois";
		}, executor);
	}
	
	
	public String getCampoComputado(Book parent) {
		return parent.getTitle() + "-" + parent.getSubject();
	}
	
}
