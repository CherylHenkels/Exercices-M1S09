package br.fullstack.education.semana9.repository;

import br.fullstack.education.semana9.entity.MembroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    //Exercício 6 - Query
    @Modifying
    @Transactional
    @Query("update MembroEntity membro set membro.nome = :nome," +
            "membro.endereco = :endereco," +
            "membro.telefone = :telefone" +
            " where membro.id = :id"
    )
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("endereco") String endereco,
                @Param("telefone") String telefone);



}
