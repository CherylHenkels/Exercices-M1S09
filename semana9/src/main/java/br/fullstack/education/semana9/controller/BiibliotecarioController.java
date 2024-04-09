package br.fullstack.education.semana9.controller;

import br.fullstack.education.semana9.entity.BibliotecarioEntity;
import br.fullstack.education.semana9.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario")
public class BiibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    public BiibliotecarioController(BibliotecarioService bibliotecarioService) {
        this.bibliotecarioService = bibliotecarioService;
    }

    // Exercicio 3 - POST
    @PostMapping
    public BibliotecarioEntity salvarBibliotecario( @RequestBody BibliotecarioEntity bibliotecarioEntity){
        return bibliotecarioService.salvaBibliotecario(bibliotecarioEntity);
    }

    //Exercicio 4 - GET
    @GetMapping
    public List<BibliotecarioEntity> listarBibliotecarios(){
        return bibliotecarioService.listaBibliotecarios();
    }

    //Exercicio 5 - DELETE
    @DeleteMapping
    public String deletarBibliotecario(@RequestParam("id") Long id){
        bibliotecarioService.deletarBibliotecario(id);
        return "Deletado com sucesso!";
    }

    //Exercicio 7 - UPDATE
    @PutMapping
    public BibliotecarioEntity atualizarBibliotecario(@RequestBody BibliotecarioEntity bibliotecarioEntity){
        return bibliotecarioService.atualizaBibliotecario(bibliotecarioEntity);
    }

}
