package com.example.apiProjeto.repository;

import com.example.apiProjeto.model.Produto1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto1, Integer> {

    @Query("select a from Produto1 a where a.descricao like %?1%")
    List<Produto1>findByParteDescricao(String partedescricao);

    @Query("select a from Produto1 a where a.preco <?1")
    List<Produto1>findByPrecoMenorQue(double precomenorque);

    List<Produto1> findByMarca(String marca);

    @Query("select a from Produto1 a where a.marca like %?1% and a.preco <?2")
    List<Produto1> findByParteMarcaMenorPreco(String marca, double preco);
}
