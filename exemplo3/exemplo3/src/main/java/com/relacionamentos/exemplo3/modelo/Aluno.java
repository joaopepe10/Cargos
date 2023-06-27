package com.relacionamentos.exemplo3.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nome;
    @ManyToMany
    @JoinTable(
            name = "tbl_auxiliar",
            joinColumns = {@JoinColumn (name = "codigo_aluno", referencedColumnName = "codigo")},
            inverseJoinColumns = {@JoinColumn(name = "codigo_curso", referencedColumnName = "id")}
    )
    private List<Curso> cursos = new ArrayList<>();
}
