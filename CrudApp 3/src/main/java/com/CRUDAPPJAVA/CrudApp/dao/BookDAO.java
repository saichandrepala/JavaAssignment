package com.CRUDAPPJAVA.CrudApp.dao;

import java.util.List;

import com.CRUDAPPJAVA.CrudApp.model.Book;

public interface BookDAO {
    List<Book> getAllBooks();

    Book findBookById(int theId);

    Book saveBook(Book theBook);

    void deleteBookById(int theId);

    
}
