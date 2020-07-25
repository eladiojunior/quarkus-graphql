package br.com.eladiojunior.graphql.entites;

public class Restaurante {
    private String nome;
    private String proprietario;
    private String cnpj;
    private Localizacao localizacao;

    public Restaurante() {

    }
    public Restaurante(String nome, String proprietario, String cnpj, Localizacao localizacao) {
        this.nome=nome;
        this.proprietario=proprietario;
        this.cnpj=cnpj;
        this.localizacao=localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}
