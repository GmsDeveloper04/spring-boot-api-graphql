package br.next.core.resolvers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.next.core.model.Book;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookResolver implements GraphQLResolver<Book>{

	private final ExecutorService executor;

	public CompletableFuture<String> getChiclete(Book parent) {

		return CompletableFuture.supplyAsync(() ->{
			try {
				Thread.sleep(200l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Push";
		} ,executor);
	}

	public CompletionStage<String> getAbacate(Book parent) {
		return CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(200l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return "verde";
		}, executor);
	}

}
