package br.fullstack.education.semana9.repository;

import br.fullstack.education.semana9.entity.BibliotecarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    //Exercício 6 - Query
    @Modifying
    @Transactional
    @Query("update BibliotecarioEntity bibliotecario set bibliotecario.nome = :nome," +
            "bibliotecario.email = :email," +
            "bibliotecario.senha = :senha" +
            " where bibliotecario.id = :id"
    )
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("email") String email,
                @Param("senha") String senha);



}
