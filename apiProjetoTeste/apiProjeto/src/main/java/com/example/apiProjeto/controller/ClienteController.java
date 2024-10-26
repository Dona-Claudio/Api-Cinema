package com.example.apiProjeto.controller;

import com.example.apiProjeto.model.Cliente1;
import com.example.apiProjeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository clrepo;

    @PostMapping("/cadastrar")
    public void cadastrarCliente(@RequestBody Cliente1 cl){ clrepo.save(cl);}

    @GetMapping("/todos")
    public List<Cliente1> buscarTodosClientes(){ return clrepo.findAll();}

    @GetMapping("/todos/codigo/{codigo}")
    public Optional<Cliente1> buscarPorCodigo(@PathVariable("codigo") int codigo){return clrepo.findById(codigo);}

    @GetMapping("/todos/partenome/{partenome}")
    public List<Cliente1> buscarPorParteNome (@PathVariable("partenome") String partenome){return clrepo.findByParteNome(partenome);}

    @GetMapping("/todos/email/{email}")
    public List<Cliente1> buscarPorEmail (@PathVariable("email") String email){return clrepo.findByEmail(email);}

    @GetMapping("/todos/nomeEmail/{nome}/{email}")
    public List<Cliente1> buscarPorParteNomeEmail (@PathVariable("nome") String nome, @PathVariable("email") String email){return clrepo.findByParteNomeEmail(nome, email);}

    @DeleteMapping("/remover")
    public void removerCliente(@RequestBody Cliente1 cl){clrepo.delete(cl);}

    @DeleteMapping("/remover/codigo/{codigo}")
    public void removerClientePorCodigo(@PathVariable("codigo") int codigo){clrepo.deleteById(codigo);}

    @PutMapping("/atualizar")
    public void atualizarCliente(@RequestBody Cliente1 cl){ clrepo.save(cl);}
}
