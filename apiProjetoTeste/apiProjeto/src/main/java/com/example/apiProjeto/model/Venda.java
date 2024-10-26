package com.example.apiProjeto.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Venda")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @ManyToOne
    @JoinColumn(name = "cliente_codigo", nullable = false)
    private Cliente1 cliente;

    @ManyToOne
    @JoinColumn(name = "cartaz_codigo", nullable = false)
    private Cartaz cartaz;

    @ElementCollection
    @CollectionTable(name = "ProdutosComprados", joinColumns = @JoinColumn(name = "venda_codigo"))
    @Column(name = "produto")
    private List<String> produtosComprados;

    @Column(nullable = false)
    private LocalDate dataCompra;

    @Column(nullable = false)
    private String tipoIngresso;

    // getters e setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente1 getCliente() {
        return cliente;
    }

    public void setCliente(Cliente1 cliente) {
        this.cliente = cliente;
    }

    public Cartaz getCartaz() {
        return cartaz;
    }

    public void setCartaz(Cartaz cartaz) {
        this.cartaz = cartaz;
    }

    public List<String> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(List<String> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}
