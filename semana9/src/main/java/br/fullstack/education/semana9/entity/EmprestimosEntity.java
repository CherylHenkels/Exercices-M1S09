package br.fullstack.education.semana9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Table(name="emprestimos")
@Entity
@Data

public class EmprestimosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = false)
    private MembroEntity membro;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
}
