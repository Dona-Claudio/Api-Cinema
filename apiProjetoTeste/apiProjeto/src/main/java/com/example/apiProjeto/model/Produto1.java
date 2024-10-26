package com.example.apiProjeto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Produto1")
public class Produto1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(unique = true, nullable = false)
    private String descricao;

    @Column(unique = false, nullable = false)
    private double preco;

    @Column(unique = false, nullable = false)
    private String marca;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
