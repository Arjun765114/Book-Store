package org.example.service;

import org.example.entity.MyBookList;
import org.example.repository.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private BookListRepository bookListRepository;

    public void saveMyBook(MyBookList bookList){
        bookListRepository.save(bookList);
    }

    public List<MyBookList> getAllMyBooks(){
        return bookListRepository.findAll();
    }
    public void deleteById(int id){
        bookListRepository.deleteById(id);
    }
}
