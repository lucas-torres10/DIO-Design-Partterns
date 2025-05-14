package com.example.Livro.entity;

import com.example.Livro.dto.LivroDTO;
import com.example.Livro.enums.Categoria;
import jakarta.persistence.*;

@Entity
public class Livro {
    //Livro: id, titulo, anoPublicacao, Categoria (TECNOLOGIA, SAUDE, ENGENHARIA)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer anoPublicacao;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Livro() {}


    public Livro(LivroDTO dto){
        this.id = dto.id();
        this.titulo = dto.titulo();
        this.anoPublicacao = dto.anoPublicacao();
        this.categoria = dto.categoria();
    }



    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }





}

