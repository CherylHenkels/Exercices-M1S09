package br.fullstack.education.semana9.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="visitante")
@Entity
@Data

public class VisitanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String telefone;
}
