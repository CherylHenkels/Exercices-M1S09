package br.fullstack.education.semana9.controller;

import br.fullstack.education.semana9.entity.VisitanteEntity;
import br.fullstack.education.semana9.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitante")
public class VisitanteController {

    private final VisitanteService visitanteService;

    public VisitanteController(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }

    // Exercicio 3 - POST
    @PostMapping
    public VisitanteEntity salvarVisitante( @RequestBody VisitanteEntity visitanteEntity){
        return visitanteService.salvaVisitante(visitanteEntity);
    }

    //Exercicio 4 - GET
    @GetMapping
    public List<VisitanteEntity> listarVisitantes(){
        return visitanteService.listaVisitantes();
    }

    //Exercicio 5 - DELETE
    @DeleteMapping
    public String deletarVisitante(@RequestParam("id") Long id){
        visitanteService.deletarVisitante(id);
        return "Deletado com sucesso!";
    }

    //Exercicio 7 - UPDATE
    @PutMapping
    public VisitanteEntity atualizarVisitante(@RequestBody VisitanteEntity visitanteEntity){
        return visitanteService.atualizaVisitante(visitanteEntity);
    }

}
