package com.example.apiProjeto.repository;

import com.example.apiProjeto.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
    @Query("select v from Venda v where v.cartaz.dataFinalCartaz > CURRENT_DATE")
    List<Venda> findVendasAtuais();

    @Query("select v from Venda v where v.cartaz.dataFinalCartaz < CURRENT_DATE")
    List<Venda> findVendasPassadas();
}
