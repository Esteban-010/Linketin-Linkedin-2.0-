package edu.uni.pd10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uni.pd10.Service.CursoService;
import edu.uni.pd10.bean.Curso;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping("/{id}")
    public Curso buscarCurso(@PathVariable int id){
        return cursoService.buscarCurso(id);
    }
    @GetMapping("/tematica/{id}")
    public List<Curso> todosCursosTematica(@PathVariable int id){
        return cursoService.todosCursosTematica(id);
    }
}
    