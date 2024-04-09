package br.fullstack.education.semana9.service;

import br.fullstack.education.semana9.entity.BibliotecarioEntity;
import br.fullstack.education.semana9.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;
    public BibliotecarioService(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    public List<BibliotecarioEntity> listaBibliotecarios() {
        return bibliotecarioRepository.findAll();
    }

    public BibliotecarioEntity salvaBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }

    public void deletarBibliotecario(Long id) {
        bibliotecarioRepository.deleteById(id);
    }

    public BibliotecarioEntity atualizaBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
         bibliotecarioRepository.update(bibliotecarioEntity.getId(),
                bibliotecarioEntity.getNome(),
                bibliotecarioEntity.getEmail(),
                bibliotecarioEntity.getSenha());
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }
}
