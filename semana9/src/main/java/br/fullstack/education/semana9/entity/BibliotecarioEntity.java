package br.fullstack.education.semana9.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="bibliotecario")
@Entity
@Data

public class BibliotecarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String email;
    private String senha;
}
