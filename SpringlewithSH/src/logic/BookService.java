package logic;

import java.util.List;

import daoClass.Book;

public interface BookService
{
	// 添加图书
	int addBook(Book book);

	List<Book> getAllBooks();
	
	void deleteBook(int id);
}

