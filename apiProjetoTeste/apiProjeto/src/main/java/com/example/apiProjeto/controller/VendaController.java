package com.example.apiProjeto.controller;

import com.example.apiProjeto.model.Venda;
import com.example.apiProjeto.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiVenda")
public class VendaController {
    @Autowired
    VendaRepository vendaRepo;

    @PostMapping("/cadastrar")
    public void cadastrarVenda(@RequestBody Venda venda) {
        if (venda.getCliente() == null || venda.getCliente().getCodigo() == 0 ||
                venda.getCartaz() == null || venda.getCartaz().getCodigo() == 0 ||
                venda.getDataCompra() == null || venda.getCartaz().getDataInicialCartaz() == null || venda.getCartaz().getDataFinalCartaz() == null) {
            throw new IllegalArgumentException("Dados incompletos.");
        }
        if (venda.getDataCompra().isBefore(venda.getCartaz().getDataInicialCartaz()) || venda.getDataCompra().isAfter(venda.getCartaz().getDataFinalCartaz())) {
            throw new IllegalArgumentException("Data de compra fora do período de cartaz.");
        }
        vendaRepo.save(venda);
    }


    @GetMapping("/todas")
    public List<Venda> buscarTodasVendas() {
        return vendaRepo.findAll();
    }

    @GetMapping("/codigo/{codigo}")
    public Optional<Venda> buscarPorCodigo(@PathVariable("codigo") int codigo) {
        return vendaRepo.findById(codigo);
    }

    @GetMapping("/atuais")
    public List<Venda> buscarVendasAtuais() {
        return vendaRepo.findVendasAtuais();
    }

    @GetMapping("/passadas")
    public List<Venda> buscarVendasPassadas() {
        return vendaRepo.findVendasPassadas();
    }

    @DeleteMapping("/remover/{codigo}")
    public void removerVendaPorCodigo(@PathVariable("codigo") int codigo) {
        vendaRepo.deleteById(codigo);
    }

    @PutMapping("/atualizar")
    public void atualizarVenda(@RequestBody Venda venda) {
        vendaRepo.save(venda);
    }
}
