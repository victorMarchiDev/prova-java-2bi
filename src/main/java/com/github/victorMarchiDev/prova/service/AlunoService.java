package com.github.victorMarchiDev.prova.service;

import com.github.victorMarchiDev.prova.model.Aluno;
import com.github.victorMarchiDev.prova.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno criarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    public  Aluno findById(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public Aluno atualizarAluno(Long id, Aluno aluno) {
        return alunoRepository.save(aluno);
    }

}

