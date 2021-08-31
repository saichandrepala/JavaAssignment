package com.CRUDAPPJAVA.CrudApp.service;

import java.util.List;

import com.CRUDAPPJAVA.CrudApp.dao.BookDAO;
import com.CRUDAPPJAVA.CrudApp.model.Book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService{
    
    BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(@Qualifier("bookDAOJpaImpl") BookDAO theBookDAO){
        bookDAO = theBookDAO;
    }

    @Override
    @Transactional
    public List<Book> findAllBooks() {
        
        return bookDAO.getAllBooks();
    }

    @Override
    @Transactional
    public Book findBookById(int theId) {
        
        return bookDAO.findBookById(theId);
    }

    @Override
    @Transactional
    public Book saveBook(Book theBook) {
        
        return bookDAO.saveBook(theBook);
    }

    @Override
    @Transactional
    public int deleteBookById(int theId) {
        bookDAO.deleteBookById(theId);
        return theId;
    }

  
    
    
}
