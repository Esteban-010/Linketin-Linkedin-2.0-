package edu.uni.pd10.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import edu.uni.pd10.bean.Curso;

@Repository
public class CursoDao {
    
    @Autowired
    JdbcTemplate template;

    public Curso buscarCurso(int id){
        String sql = "SELECT * FROM CURSO WHERE ID = ?";
        Curso c = null;
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if(rs.next()){
            c = new Curso();
            c.setId(rs.getInt("ID"));
            c.setNombre(rs.getString("NOMBRE"));
            c.setDescripcion(rs.getString("DESCRIPCION"));
            c.setPremium(rs.getBoolean("PREMIUM"));
            c.setCategoria(rs.getInt("TEMATICA"));
        }
        return c;
    }
    
    public List<Curso> todosCursosTematica(int id){
        String sql = "SELECT * FROM CURSO WHERE TEMATICA = ?";
        List<Curso> lista = new ArrayList<>();
        SqlRowSet rs = template.queryForRowSet(sql, id);
        while(rs.next()){
            Curso c = new Curso();
            c.setId(rs.getInt("ID"));
            c.setNombre(rs.getString("NOMBRE"));
            c.setDescripcion(rs.getString("DESCRIPCION"));
            c.setPremium(rs.getBoolean("PREMIUM"));
            c.setCategoria(rs.getInt("TEMATICA"));
            lista.add(c);
        }
        return lista;
    }
}
