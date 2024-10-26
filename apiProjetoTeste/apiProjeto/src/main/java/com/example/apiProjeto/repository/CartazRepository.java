package com.example.apiProjeto.repository;

import com.example.apiProjeto.model.Cartaz;
import com.example.apiProjeto.model.Produto1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartazRepository extends JpaRepository <Cartaz, Integer> {
    @Query("select a from Cartaz a where a.titulo like %?1%")
    List<Produto1> findByParteTitulo(String titulo);

}
