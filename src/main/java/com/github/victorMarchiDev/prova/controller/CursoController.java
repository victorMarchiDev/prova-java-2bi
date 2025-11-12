package com.github.victorMarchiDev.prova.controller;

import com.github.victorMarchiDev.prova.model.Aluno;
import com.github.victorMarchiDev.prova.model.Curso;
import com.github.victorMarchiDev.prova.service.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/curso")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }


    @GetMapping
    @Operation(summary = "Listar Cursos")
    public List<Curso> listarCurso() {
        return cursoService.listarCurso();
    }

    @PostMapping
    @Operation(summary = "Criar Curso")
    public ResponseEntity<Curso> salvarCurso(@RequestBody Curso curso) {
        Curso cursoCriado = cursoService.criarCurso(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoCriado);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar Curso")
    public ResponseEntity<Void> deletarCurso(@PathVariable Long id) {
        cursoService.deletarCurso(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar Curso")
    public ResponseEntity<Curso> atualizarCurso(
            @PathVariable Long id,
            @RequestBody Curso curso) {
        Curso cursoAtualizado =  cursoService.atualizarCurso(id, curso);
        return ResponseEntity.status(HttpStatus.OK).body(cursoAtualizado);
    }

}
