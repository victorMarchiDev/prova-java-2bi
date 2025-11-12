package com.github.victorMarchiDev.prova.repository;

import com.github.victorMarchiDev.prova.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
