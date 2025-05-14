package com.example.Livro.repository;

import com.example.Livro.entity.Livro;
import com.example.Livro.enums.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {



        List<Livro> findByTitulo(String titulo);
        List<Livro> findByAnoPublicacao(Integer anoPublicacao);
        List<Livro> findByCategoria(Categoria categoria);
        Optional<Livro> findById(Long id);
}
