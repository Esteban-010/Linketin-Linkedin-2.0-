package edu.uni.pd10.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uni.pd10.Dao.TematicaDao;
import edu.uni.pd10.bean.Curso;
import edu.uni.pd10.bean.Tematica;

@Service
public class TematicaService {
    
    @Autowired
    TematicaDao tematicaDao;

    @Autowired
    CursoService cursoService;

    public Tematica getTematica(int id){
        Tematica t = tematicaDao.getTematica(id);
        List<Curso> lista = cursoService.todosCursosTematica(id);
        tematicaDao.setCursos(lista, t);
        return t;
    }

}
