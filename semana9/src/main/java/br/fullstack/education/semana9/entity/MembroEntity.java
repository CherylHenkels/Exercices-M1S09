package br.fullstack.education.semana9.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="membro")
@Entity
@Data

public class MembroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String endereco;
    private String telefone;
}