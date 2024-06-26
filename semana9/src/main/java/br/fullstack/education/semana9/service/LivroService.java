package br.fullstack.education.semana9.service;

import br.fullstack.education.semana9.entity.LivroEntity;
import br.fullstack.education.semana9.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<LivroEntity> listaLivros() {
        return livroRepository.findAll();
    }

    public LivroEntity salvaLivro(LivroEntity livroEntity) {
        return livroRepository.save(livroEntity);
    }

    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public LivroEntity atualizaLivro(LivroEntity livroEntity) {
         livroRepository.update(livroEntity.getId(),
                livroEntity.getTitulo(),
                livroEntity.getAutor(),
                livroEntity.getAnoPublicacao());
        return livroRepository.save(livroEntity);
    }

    public LivroEntity buscarPorId(Long id) throws Exception {
        List<LivroEntity> livros = livroRepository.findAll();
        for (LivroEntity livro : livros) {
            if (livro.getId().equals(id)) {
                return livro;
            }
        }
        throw new Exception("Livro não encontrado");
    }


}
