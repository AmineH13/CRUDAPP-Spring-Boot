package com.apprentissage.crudapp.repository;
import com.apprentissage.crudapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitre(String titre);
    Book findByAuteur(String auteur);

}

