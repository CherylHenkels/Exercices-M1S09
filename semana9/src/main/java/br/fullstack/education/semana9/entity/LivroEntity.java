package br.fullstack.education.semana9.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="livro")
@Entity
@Data

public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    private String autor;
    private Long anoPublicacao;
}
