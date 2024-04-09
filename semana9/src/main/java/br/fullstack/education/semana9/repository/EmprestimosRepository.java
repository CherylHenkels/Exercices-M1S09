package br.fullstack.education.semana9.repository;

import br.fullstack.education.semana9.entity.EmprestimosEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


public interface EmprestimosRepository extends JpaRepository<EmprestimosEntity, Long> {

//    List<EmprestimosEntity> findByLivroId(Long livroId);
//    List<EmprestimosEntity> findByMembroId(Long membroId);

   // Exercício 6 - Query
    @Modifying
    @Transactional
    @Query("update EmprestimosEntity emprestimos set emprestimos.membro.id = :membro_id," +
            "emprestimos.livro.id= :livro_id," +
            "emprestimos.dataDevolucao = :dataDevolucao," +
            "emprestimos.dataEmprestimo = :dataEmprestimo" +
            " where emprestimos.id = :id"
    )
    void update(@Param("id") Long id,
                @Param("livro_id") Long livroId,
                @Param("membro_id") Long membroId,
                @Param("dataEmprestimo") LocalDate dataEmprestimo,
                @Param("dataDevolucao") LocalDate dataDevolucao);


}
