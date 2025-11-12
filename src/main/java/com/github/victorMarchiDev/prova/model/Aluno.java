package com.github.victorMarchiDev.prova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

    private Long id;
    private String nome;

}
