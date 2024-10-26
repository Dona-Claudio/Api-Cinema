package com.example.apiProjeto.model;

import jakarta.persistence.*;
import org.hibernate.bytecode.internal.bytebuddy.BytecodeProviderImpl;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name ="Cartaz1")

public class Cartaz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(unique = true, nullable = false)
    private String titulo;

    @Column(unique = false, nullable = false)
    private String descricao;

    @Column(unique = false, nullable = false)
    private String duracao;

    @Column(unique = false, nullable = false)
    private String idadeIndicativa;

    @Column(unique = false, nullable = false)
    private LocalDate dataInicialCartaz;

    @Column(unique = false, nullable = false)
    private LocalDate dataFinalCartaz;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getIdadeIndicativa() {
        return idadeIndicativa;
    }

    public void setIdadeIndicativa(String idadeIndicativa) {
        this.idadeIndicativa = idadeIndicativa;
    }

    public LocalDate getDataInicialCartaz() {
        return dataInicialCartaz;
    }

    public void setDataInicialCartaz(LocalDate dataInicialCartaz) {
        this.dataInicialCartaz = dataInicialCartaz;
    }

    public LocalDate getDataFinalCartaz() {
        return dataFinalCartaz;
    }

    public void setDataFinalCartaz(LocalDate dataFinalCartaz) {
        this.dataFinalCartaz = dataFinalCartaz;
    }
}
