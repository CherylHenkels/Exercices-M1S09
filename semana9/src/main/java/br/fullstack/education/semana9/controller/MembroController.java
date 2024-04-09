package br.fullstack.education.semana9.controller;

import br.fullstack.education.semana9.entity.MembroEntity;
import br.fullstack.education.semana9.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membro")
public class MembroController {

    private final MembroService membroService;

    public MembroController(MembroService membroService) {
        this.membroService = membroService;
    }

    // Exercicio 3 - POST
    @PostMapping
    public MembroEntity salvarMembro( @RequestBody MembroEntity membroEntity){
        return membroService.salvaMembro(membroEntity);
    }

    //Exercicio 4 - GET
    @GetMapping
    public List<MembroEntity> listarMembros(){
        return membroService.listaMembros();
    }

    //Exercicio 5 - DELETE
    @DeleteMapping
    public String deletarMembro(@RequestParam("id") Long id){
        membroService.deletarMembro(id);
        return "Deletado com sucesso!";
    }

    //Exercicio 7 - UPDATE
    @PutMapping
    public MembroEntity atualizarMembro(@RequestBody MembroEntity membroEntity){
        return membroService.atualizaMembro(membroEntity);
    }

}
