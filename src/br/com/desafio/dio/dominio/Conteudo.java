package br.com.desafio.dio.dominio;

import java.util.UUID;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private final UUID id = UUID.randomUUID();

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }
}
