package br.fullstack.education.semana9.service;

import br.fullstack.education.semana9.entity.EmprestimosEntity;
import br.fullstack.education.semana9.entity.LivroEntity;
import br.fullstack.education.semana9.entity.MembroEntity;
import br.fullstack.education.semana9.repository.EmprestimosRepository;
import br.fullstack.education.semana9.repository.LivroRepository;
import br.fullstack.education.semana9.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimosService {

    private final EmprestimosRepository emprestimosRepository;
    private final LivroRepository livroRepository;
    private final MembroRepository membroRepository;
    private final LivroService livroService;
    private final MembroService membroService;

    public EmprestimosService(EmprestimosRepository emprestimosRepository, LivroRepository livroRepository, MembroRepository membroRepository, LivroService livroService, MembroService membroService) {
        this.emprestimosRepository = emprestimosRepository;
        this.livroRepository = livroRepository;
        this.membroRepository = membroRepository;
        this.livroService = livroService;
        this.membroService = membroService;
    }

    public List<EmprestimosEntity> listaEmprestimoss() {
        return emprestimosRepository.findAll();
    }


    public EmprestimosEntity salvaEmprestimos(EmprestimosEntity emprestimoEntity) throws Exception {


        return emprestimosRepository.save(emprestimoEntity);
    }

    public void deletarEmprestimos(Long id) {
        emprestimosRepository.deleteById(id);
    }

    public EmprestimosEntity atualizaEmprestimos(EmprestimosEntity emprestimosEntity) {
         emprestimosRepository.update(emprestimosEntity.getId(),
                emprestimosEntity.getLivro().getId(),
                emprestimosEntity.getMembro().getId(),
                emprestimosEntity.getDataEmprestimo(),
                emprestimosEntity.getDataDevolucao());
        return emprestimosRepository.save(emprestimosEntity);
    }


}
