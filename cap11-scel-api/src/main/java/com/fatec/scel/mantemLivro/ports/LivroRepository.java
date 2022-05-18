package com.fatec.scel.mantemLivro.ports;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fatec.scel.mantemLivro.model.Livro;
@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {
}
