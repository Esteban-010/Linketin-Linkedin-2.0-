package edu.uni.pd10.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uni.pd10.Dao.CursoDao;
import edu.uni.pd10.bean.Curso;

@Service
public class CursoService {
    @Autowired
    CursoDao cursoDao;

    public Curso buscarCurso(int id){
        return cursoDao.buscarCurso(id);
    }
    public List<Curso> todosCursosTematica(int id){
        return cursoDao.todosCursosTematica(id);
    } 
}
