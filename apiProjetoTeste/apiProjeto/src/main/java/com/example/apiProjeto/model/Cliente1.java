package com.example.apiProjeto.model;


import jakarta.persistence.*;

@Entity
@Table(name ="Cliente1")

public class Cliente1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(unique = false, nullable = false)
    private String nome;

    @Column(unique = false, nullable = false)
    private int idade;

    @Column(unique = true, nullable = false)
    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
