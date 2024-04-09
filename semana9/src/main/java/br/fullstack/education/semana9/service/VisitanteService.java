package br.fullstack.education.semana9.service;

import br.fullstack.education.semana9.entity.VisitanteEntity;
import br.fullstack.education.semana9.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;
    public VisitanteService(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }

    public List<VisitanteEntity> listaVisitantes() {
        return visitanteRepository.findAll();
    }

    public VisitanteEntity salvaVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.save(visitanteEntity);
    }

    public void deletarVisitante(Long id) {
        visitanteRepository.deleteById(id);
    }

    public VisitanteEntity atualizaVisitante(VisitanteEntity visitanteEntity) {
         visitanteRepository.update(visitanteEntity.getId(),
                visitanteEntity.getNome(),
                visitanteEntity.getTelefone());
        return visitanteRepository.save(visitanteEntity);
    }
}
