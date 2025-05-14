package com.example.Livro.service;

import com.example.Livro.entity.Livro;
import com.example.Livro.enums.Categoria;
import com.example.Livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarPorId(Long id) {
        return livroRepository.findById(id);
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    }

    public List<Livro> buscarPorAnoPublicacao(Integer anoPublicacao) {
        return livroRepository.findByAnoPublicacao(anoPublicacao);
    }

    public List<Livro> buscarPorCategoria(Categoria categoria) {
        return livroRepository.findByCategoria(categoria);
    }

    public Livro salvarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deletarPorId(Long id) {
        livroRepository.deleteById(id);
    }
}
