package com.example.apiProjeto.controller;



import com.example.apiProjeto.model.Produto1;
import com.example.apiProjeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository prepo;

    @PostMapping("/cadastrar")
    public void cadastrarProduto(@RequestBody Produto1 p){ prepo.save(p);}

    @GetMapping ("/todos")
    public List<Produto1> buscarTodosProdutos(){ return prepo.findAll();}

    @GetMapping("/todos/codigo/{codigo}")
    public Optional<Produto1> buscarPorCodigo(@PathVariable("codigo") int codigo){return prepo.findById(codigo);}

    @GetMapping("/todos/partedescricao/{partedescricao}")
    public List<Produto1> buscarPorParteDescricao(@PathVariable("partedescricao") String partedescricao){return prepo.findByParteDescricao(partedescricao);}

    @GetMapping("/todos/precomenorque/{precomenorque}")
    public List<Produto1> buscarPrecoMenorQue(@PathVariable("precomenorque") double precomenorque){return prepo.findByPrecoMenorQue(precomenorque);}

    @GetMapping("/todos/marca/{marca}")
    public List<Produto1> buscarPorMarca(@PathVariable("marca") String marca){return prepo.findByMarca(marca);}

    @GetMapping("/todos/marcapreco/{marca}/{preco}")
    public List<Produto1> buscarPorParteMarcaMenorPreco(@PathVariable("marca") String marca, @PathVariable("preco") double preco){return  prepo.findByParteMarcaMenorPreco(marca,preco);}

    @DeleteMapping("/remover")
    public void removerProduto(@RequestBody Produto1 p){ prepo.delete(p);}

    @DeleteMapping("/remover/codigo/{codigo}")
    public void  removerProdutoPorCodigo(@PathVariable("codigo") int codigo){ prepo.deleteById(codigo);}

    @PutMapping("/atualizar")
    public void atualizarProduto(@RequestBody Produto1 p){prepo.save(p);}
}
