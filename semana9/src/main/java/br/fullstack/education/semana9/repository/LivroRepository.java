package br.fullstack.education.semana9.repository;

import br.fullstack.education.semana9.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
}
