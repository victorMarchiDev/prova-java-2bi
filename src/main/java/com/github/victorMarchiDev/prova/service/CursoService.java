package com.github.victorMarchiDev.prova.service;

import com.github.victorMarchiDev.prova.model.Aluno;
import com.github.victorMarchiDev.prova.model.Curso;
import com.github.victorMarchiDev.prova.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso criarCurso(Curso Curso) {
        return cursoRepository.save(Curso);
    }

    public List<Curso> listarCurso() {
        return cursoRepository.findAll();
    }

    public void deletarCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    public  Curso findById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso atualizarCurso(Long id, Curso Curso) {
        return cursoRepository.save(Curso);
    }

}
