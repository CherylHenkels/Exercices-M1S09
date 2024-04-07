package br.fullstack.education.semana9.controller;

import br.fullstack.education.semana9.entity.LivroEntity;
import br.fullstack.education.semana9.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    // Exercicio 3 - POST
    @PostMapping
    public LivroEntity salvarLivro( @RequestBody LivroEntity livroEntity){
        return livroService.salvaLivro(livroEntity);
    }

    //Exercicio 4 - GET
    @GetMapping
    public List<LivroEntity> listarLivros(){
        return livroService.listaLivros();
    }

}
