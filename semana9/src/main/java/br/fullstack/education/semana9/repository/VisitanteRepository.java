package br.fullstack.education.semana9.repository;

import br.fullstack.education.semana9.entity.VisitanteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    //Exercício 6 - Query
    @Modifying
    @Transactional
    @Query("update VisitanteEntity visitante set visitante.nome = :nome," +
            "visitante.telefone = :telefone" +
            " where visitante.id = :id"
    )
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("telefone") String telefone);



}
