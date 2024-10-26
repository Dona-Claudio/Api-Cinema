package com.example.apiProjeto.controller;

import com.example.apiProjeto.model.Cartaz;
import com.example.apiProjeto.repository.CartazRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/apiCartaz")

public class CartazController {

    @Autowired
    CartazRepository cartRepo;

    @PostMapping("/cadastrar")
    public void cadastrarCartaz(@RequestBody Cartaz c){ cartRepo.save(c);}

    @GetMapping("/todos")
    public List<Cartaz> buscarTodosCartaz(){ return cartRepo.findAll();}

    @DeleteMapping("/remover/codigo/{codigo}")
    public void removerProdutoPorCartaz(@PathVariable("codigo") int codigo){ cartRepo.deleteById(codigo);}

}
