package com.example.apiProjeto.repository;

import com.example.apiProjeto.model.Cliente1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente1, Integer> {

    @Query("select a from Cliente1 a where a.nome like %?1%")
    List<Cliente1>findByParteNome(String partenome);

    List<Cliente1>findByEmail(String email);

    @Query("select a from Cliente1 a where a.nome like %?1% and a.email like %?2%")
    List<Cliente1>findByParteNomeEmail(String nome, String email);
}
