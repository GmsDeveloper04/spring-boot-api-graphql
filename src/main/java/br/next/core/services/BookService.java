package br.next.core.services;

import java.util.Optional;

import br.next.core.model.Book;

public interface BookService {
	public Optional<Book> findBook(String isbn);
}
