package logic;

import daoClass.Book;

import java.util.List;

import dao.BookDao;

public class BookServiceImpl implements BookService {

	
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao){
		this.bookDao=bookDao;
	}
	


	@Override
	public List<Book> getAllBooks() {
		return bookDao.findAll(Book.class);
	}

	@Override
	public void deleteBook(int id) {
		bookDao.delete(Book.class, id);
		
	}

	@Override
	public int addBook(Book book) {
		return (Integer) bookDao.save(book);
	}
	
	

}
