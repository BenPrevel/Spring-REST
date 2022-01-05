package com.wcs.challenge_rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcs.challenge_rest.entity.Book;


@Repository
public interface BookRepository extends JpaRepository <Book, Integer> {

    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
    
}
