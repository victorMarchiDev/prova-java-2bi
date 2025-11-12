package com.github.victorMarchiDev.prova.controller;

import com.github.victorMarchiDev.prova.model.Aluno;
import com.github.victorMarchiDev.prova.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @PostMapping
    public ResponseEntity<Aluno> salvarAluno(@RequestBody Aluno aluno) {
        Aluno alunoCriado = alunoService.criarAluno(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoCriado);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping
    public ResponseEntity<Aluno> atualizarAluno(
            @PathVariable Long id,
            @RequestBody Aluno aluno) {
      Aluno alunoAtualizado =  alunoService.atualizarAluno(id, aluno);
        return ResponseEntity.status(HttpStatus.OK).body(alunoAtualizado);
    }

}
