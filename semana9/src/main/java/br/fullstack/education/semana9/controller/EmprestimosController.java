package br.fullstack.education.semana9.controller;

import br.fullstack.education.semana9.entity.EmprestimosEntity;
import br.fullstack.education.semana9.service.EmprestimosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimosController {

    private final EmprestimosService emprestimosService;

    public EmprestimosController(EmprestimosService emprestimosService) {
        this.emprestimosService = emprestimosService;
    }

//    // Exercicio 3 - POST
//    @PostMapping("{livroId}/add-livro/{membroId}/add-membro")
//    public EmprestimosEntity salvarEmprestimos( @PathVariable Long livroId, @PathVariable Long membroId, @RequestBody EmprestimosEntity emprestimosEntity) throws Exception {
//        EmprestimosEntity emprestimo = emprestimosService.salvaEmprestimos(livroId, membroId);
//        return emprestimo;
//    }

    // Exercicio 3 - POST
    @PostMapping
    public EmprestimosEntity salvarEmprestimos(  @RequestBody EmprestimosEntity emprestimosEntity) throws Exception {
        EmprestimosEntity emprestimo = emprestimosService.salvaEmprestimos(emprestimosEntity);
        return emprestimo;
    }

    //Exercicio 4 - GET
    @GetMapping
    public List<EmprestimosEntity> listarEmprestimoss(){
        return emprestimosService.listaEmprestimoss();
    }

    //Exercicio 5 - DELETE
    @DeleteMapping
    public String deletarEmprestimos(@RequestParam("id") Long id){
        emprestimosService.deletarEmprestimos(id);
        return "Deletado com sucesso!";
    }

    //Exercicio 7 - UPDATE
    @PutMapping
    public EmprestimosEntity atualizarEmprestimos(@RequestBody EmprestimosEntity emprestimosEntity){
        return emprestimosService.atualizaEmprestimos(emprestimosEntity);
    }

}
