package br.com.eladiojunior.graphql.entites;

import java.math.BigDecimal;

public class Prato {
    private String nome;
    private String descricao;
    private BigDecimal valor;

    public Prato(String nome, String descricao, BigDecimal valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
