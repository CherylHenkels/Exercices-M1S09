package br.fullstack.education.semana9.repository;

import br.fullstack.education.semana9.entity.LivroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    //Exercício 6 - Query
    @Modifying
    @Transactional
    @Query("update LivroEntity livro set livro.titulo = :titulo," +
            "livro.autor = :autor," +
            "livro.anoPublicacao = :anoPublicacao" +
            " where livro.id = :id"
    )
    void update(@Param("id") Long id,
                @Param("titulo") String titulo,
                @Param("autor") String autor,
                @Param("anoPublicacao") Long anoPublicacao);



}
