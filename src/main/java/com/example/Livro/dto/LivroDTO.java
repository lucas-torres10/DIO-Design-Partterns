package com.example.Livro.dto;

import com.example.Livro.enums.Categoria;

public record LivroDTO(Long id, String titulo, Integer anoPublicacao, Categoria categoria ) {


}
